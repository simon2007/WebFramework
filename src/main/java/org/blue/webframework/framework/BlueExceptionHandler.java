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
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.exception.BaseException;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.exception.UIException;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.utils.StringHelper;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ErrorHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

/**
 * 异步异常处理
 * 
 * @author Long
 *
 */
public class BlueExceptionHandler extends ExceptionHandlerExceptionResolver
		implements AsyncUncaughtExceptionHandler, ErrorHandler {

	private final Logger logger = LogManager.getLogger(BlueExceptionHandler.class);

	/**
	 * 异步任务异常处理
	 */
	@Override
	public void handleUncaughtException(Throwable exception, Method method, Object... arg2) {
		reportLogMessage(exception, null, method, arg2);
	}

	/**
	 * 定时任务异常处理
	 */
	@Override
	public void handleError(Throwable exception) {

		reportLogMessage(exception, null, null);

	}

	@Resource
	private EmailService emailService;

	public BlueExceptionHandler() {
		setWarnLogCategory("exceptionHandler");
	}

	@Override
	protected void logException(Exception ex, HttpServletRequest request) {

	}

	protected void reportLogMessage(Throwable ex, HttpServletRequest request, Method method, Object... args) {

		boolean needReportError = false;

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		if (request != null) {
			String userAgent = request.getHeader("user-agent");
			if ("YisouSpider".equals(userAgent))
				return;
			writer.print(request.getMethod() + " " + request.getRequestURI());
			String query = request.getQueryString();
			if (query != null && query.length() > 0)
				writer.print("?" + query);
			writer.println();
			Enumeration<String> headNames = request.getHeaderNames();
			if ((headNames.hasMoreElements()))
				writer.print("header:");
			while (headNames.hasMoreElements()) {
				String headName = headNames.nextElement();
				writer.print(" ");
				writer.print(headName);
				writer.print(":");
				writer.println(request.getHeader(headName) );
			}

			HttpSession session = request.getSession(false);
			if (session != null) {
				headNames = session.getAttributeNames();
				if (headNames.hasMoreElements())
					writer.println("session:");
				while (headNames.hasMoreElements()) {
					String name = headNames.nextElement();
					writer.append(" ");
					writer.print(name);
					writer.print(":");
					writer.println(session.getAttribute(name) );
				}
			}

		}
		writer.println("args:" );
		Enumeration<?> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement().toString();
			writer.append(" ").append(key).append("=");

			String[] values = request.getParameterValues(key);
			for (int i = 0; i < values.length; i++) {
				if (i > 0)
					writer.print(",");
				writer.print(values[i]);
			}
			writer.println();
		}

		if (ex instanceof BaseException) {
			BaseException baseException = (BaseException) ex;
			writer.println("code:" + baseException.getCode() );
			writer.println("msg:" + baseException.getMessage() );
			if (ex instanceof SystemException)
				needReportError = true;// 系统异常要上报
		} else if (ex instanceof ClientAbortException
				|| (ex.getCause() != null && ex.getCause() instanceof ClientAbortException))
			needReportError = false;
		else
			needReportError = true;// 其他异常要上报

		writer.println("exception:" );
		ex.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		String msg = buffer.toString();
		if (needReportError) {
			try {

				String subject = "服务器出错";
				InetAddress addr = InetAddress.getLocalHost();
				subject += ",ip:" + addr.getHostAddress().toString();// 获得本机IP
				subject += ",name:" + addr.getHostName().toString();// 获得本机IP
				emailService.sendErrorEmail(subject, msg.replace("\n\r", "<br/>").replace(" ", "&nbsp;"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		logger.error(msg);
	}

	@Override
	protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response,
			HandlerMethod handlerMethod, Exception exception) {
		try {
			if (exception == null || exception instanceof ClientAbortException)
				return super.doResolveException(request, response, handlerMethod, exception);

			reportLogMessage(exception, request, null);
			if (handlerMethod == null)
				return super.doResolveHandlerMethodException(request, response, handlerMethod, exception);

			Method method = handlerMethod.getMethod();
			if (method == null)
				return super.doResolveException(request, response, handlerMethod, exception);

			ResponseStatus responseStatusAnn = AnnotationUtils.findAnnotation(method, ResponseStatus.class);
			if (responseStatusAnn != null) // 如果有自带处理方案
				return super.doResolveException(request, response, handlerMethod, exception);

			ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(method, ResponseBody.class);
			if (responseBodyAnn != null
					|| AnnotationUtils.findAnnotation(handlerMethod.getBeanType(), RestController.class) != null)
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
		ModelAndView modelAndView = new ModelAndView("/error");
		modelAndView.addObject("exception", exception);
		if (exception instanceof BaseException) {
			BaseException baseException = (BaseException) exception;
			modelAndView.addAllObjects(baseException.getDetails());
		}
		return modelAndView;

	}
}
