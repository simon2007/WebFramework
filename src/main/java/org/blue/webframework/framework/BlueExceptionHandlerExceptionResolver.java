package org.blue.webframework.framework;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.ClientAbortException;
import org.blue.webframework.exception.BaseException;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.exception.UIException;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.utils.ServerHelper;
import org.blue.webframework.utils.StringHelper;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

/**
 * 统一异常处理器
 * 
 * @author Long
 *
 */
public class BlueExceptionHandlerExceptionResolver extends ExceptionHandlerExceptionResolver {

	public BlueExceptionHandlerExceptionResolver() {
		setWarnLogCategory("exceptionHandler");
	}

	private String newLine = "\r\n";

	@Override
	protected String buildLogMessage(Exception ex, HttpServletRequest request) {
		if (ex == null)
			return "";
		String userAgent = request.getHeader("user-agent");
		if ("YisouSpider".equals(userAgent))
			return "";
		boolean needReportError = false;

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		writer.write("url:" + request.getRequestURI() + newLine);
		writer.write("query:" + request.getQueryString() + newLine);

		writer.write("method:" + request.getMethod() + newLine);
		writer.write("user-agent:" + userAgent + newLine);
		try {
			HttpSession session = request.getSession();
			writer.write("SESSION_ACCOUNT_ID:" + ServerHelper.getCurrentAccountId(session) + newLine);
			writer.write("SESSION_ROLE_ID:" + ServerHelper.getCurrentRoleId(session) + newLine);// 用户id
			writer.write("SESSION_ACCOUNT_NAME:" + ServerHelper.getCurrentCurrentAccountName(session) + newLine);// 用户id
		} catch (Exception e) {
			// e.printStackTrace();
		}
		writer.write("args:" + newLine);
		Enumeration<?> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement().toString();
			writer.append(" ").append(key).append("=");

			String[] values = request.getParameterValues(key);
			for (int i = 0; i < values.length; i++) {
				if (i > 0)
					writer.append(",");
				writer.append(values[i]);
			}
			writer.append(newLine);
		}

		if (ex instanceof BaseException) {
			BaseException baseException = (BaseException) ex;
			writer.write("code:" + baseException.getCode() + newLine);
			writer.write("msg:" + baseException.getMessage() + newLine);
			if (ex instanceof SystemException)
				needReportError = true;// 系统异常要上报
		} else if (ex instanceof ClientAbortException
				|| (ex.getCause() != null && ex.getCause() instanceof ClientAbortException))
			needReportError = false;
		else
			needReportError = true;// 其他异常要上报

		writer.write("exception:" + newLine);
		ex.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		String msg = buffer.toString();
		if (needReportError)
			reportException(request, ex, msg);
		return msg;
	}

	@Resource
	private EmailService emailService;

	private void reportException(HttpServletRequest request, Throwable ex, String msg) {
		try {

			String subject = "服务器出错";
			InetAddress addr = InetAddress.getLocalHost();
			subject += ",ip:" + addr.getHostAddress().toString();// 获得本机IP
			subject += ",name:" + addr.getHostName().toString();// 获得本机IP
			emailService.sendEmailNew(subject, msg.replace(newLine, "<br/>").replace(" ", "&nbsp;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response,
			HandlerMethod handlerMethod, Exception exception) {
		try {
			if (handlerMethod == null)
				return null;

			if (exception == null)
				return null;

			if (exception instanceof ClientAbortException) {// 用户点击取消
				return null;
			}

			Method method = handlerMethod.getMethod();
			if (method == null) {
				return null;
			}

			ResponseStatus responseStatusAnn = AnnotationUtils.findAnnotation(method, ResponseStatus.class);
			if (responseStatusAnn != null) {
				// 如果有自带处理方案
				HttpStatus responseStatus = responseStatusAnn.value();
				String reason = responseStatusAnn.reason();
				if (!StringUtils.hasText(reason)) {
					response.setStatus(responseStatus.value());
				} else {
					response.sendError(responseStatus.value(), reason);
				}
				return new ModelAndView();
			}

			ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(method, ResponseBody.class);
			if (responseBodyAnn != null || AnnotationUtils.findAnnotation(handlerMethod.getBeanType(), RestController.class)!=null)
				return handleResponseBody(exception, handlerMethod, request, response);


			return handleResponseError(exception, handlerMethod, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("redirect:/");
		}
	}

	/**
	 * app的接口与ajax处理方式
	 * 
	 * @param exception
	 * @param handlerMethod
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	private ModelAndView handleResponseBody(Exception exception, HandlerMethod handlerMethod,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView(new FastJsonJsonView());
		// 构建异常返回参数

		if (exception instanceof BaseException) {
			BaseException baseException = (BaseException) exception;
			modelAndView.addObject("code", baseException.getCode());
			// 增加详细参数
			if (!baseException.getDetails().isEmpty())
				modelAndView.addObject("data", baseException.getDetails());
		} else
			modelAndView.addObject("code", "9999");

		modelAndView.addObject("message", exception.getMessage());

		return modelAndView;

	}

	/**
	 * 页面展示出错处理方式
	 * 
	 * @param exception
	 * @param handlerMethod
	 * @param request
	 * @param response
	 * @return
	 */
	private ModelAndView handleResponseError(Exception exception, HandlerMethod handlerMethod,
			HttpServletRequest request, HttpServletResponse response) {

		if (exception instanceof IllegalStateException) {
			if (request.getSession(false) == null) {
				HttpSession session = request.getSession(true);
				if (session.isNew()) {
					// session过期,直接跳首页
					session.setAttribute("msg", "登录已经过期，请重新登录");
					return new ModelAndView("redirect:/");
				}

			}
		}

		if (exception instanceof UIException) {// 有的页面出错之后要跳转到指定页面
			UIException uiException = (UIException) exception;
			String view = uiException.getView();
			if (StringHelper.isBlank(view)) {
				// 默认跳首页
				view = "redirect:/index";
				request.getSession().setAttribute("msg", uiException.getMessage());
			}
			ModelAndView modelAndView = new ModelAndView(view);
			modelAndView.addAllObjects(uiException.getDetails());
			modelAndView.addObject("msg", uiException.getMessage());
			return modelAndView;
		}

		// 默认处理页面
		ModelAndView modelAndView = new ModelAndView("/common/500");
		modelAndView.addObject("exception", exception);
		if (exception instanceof BaseException) {
			BaseException baseException = (BaseException) exception;
			modelAndView.addAllObjects(baseException.getDetails());
		}
		return modelAndView;

	}

}
