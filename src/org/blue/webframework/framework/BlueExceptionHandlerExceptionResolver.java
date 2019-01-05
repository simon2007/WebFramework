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

import org.blue.webframework.exception.BaseException;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.exception.UIException;
import org.blue.webframework.framework.webservice.ResultModel;
import org.blue.webframework.framework.webservice.ResultModel.Result;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.utils.StringHelper;

import org.apache.catalina.connector.ClientAbortException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;


/**
 * 统一异常处理器
 * 
 * @author Long
 *
 */
public class BlueExceptionHandlerExceptionResolver extends ExceptionHandlerExceptionResolver {

	private HandlerMethodReturnValueHandler webApiconverter;

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
			writer.write("SESSION_CUST_ID:" + session.getAttribute("SESSION_CUST_ID") + newLine);
			writer.write("SESSION_USER_ID:" + session.getAttribute("SESSION_USER_ID") + newLine);
			writer.write("SESSION_USER_TYPE:" + session.getAttribute("SESSION_USER_TYPE") + newLine);// 用户类型
			writer.write("SESSION_CUST_TYPE:" + session.getAttribute("SESSION_CUST_TYPE") + newLine);// 用户类型
			writer.write("SESSION_CONTACT_NAME:" + session.getAttribute("SESSION_CONTACT_NAME") + newLine);// 联系人姓名
			writer.write("SESSION_ROLE_ID:" + session.getAttribute("SESSION_ROLE_ID") + newLine);// 用户id
			writer.write("SESSION_USER_NAME:" + session.getAttribute("SESSION_USER_NAME") + newLine);// 用户名称
			writer.write("SESSION_CUST_NAME:" + session.getAttribute("SESSION_CUST_NAME") + newLine);// 如果前两个都为空，则取这个
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
		} else if (ex instanceof ClientAbortException || (ex.getCause() != null && ex.getCause() instanceof ClientAbortException))
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

	@Resource
	private SiteParameterService siteParameterService;

	private void reportException(HttpServletRequest request, Throwable ex, String msg) {
		try {
			String[] mutliTo = siteParameterService.getParamValue("errorMailTo", "lilw@zhaoxie.net,zhanyd@zhaoxie.net,lianj@zhaoxie.net").split(",");
			String subject = "服务器出错";
			InetAddress addr = InetAddress.getLocalHost();
			subject += ",ip:" + addr.getHostAddress().toString();// 获得本机IP　　
			subject += ",name:" + addr.getHostName().toString();// 获得本机IP　
			emailService.sendEmailNew(mutliTo, subject, msg.replace(newLine, "<br/>").replace(" ", "&nbsp;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod, Exception exception) {
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
			if (responseBodyAnn != null)
				return handleResponseBody(exception, handlerMethod, request, response);

			// if (null == returnValue) {
			// returnValue = new ModelAndView();
			// if (null == returnValue.getViewName()) {
			// returnValue.setViewName(defaultErrorView);
			// }
			// }/
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
	private ModelAndView handleResponseBody(Exception exception, HandlerMethod handlerMethod, HttpServletRequest request, HttpServletResponse response) throws Exception {

		String packageName = handlerMethod.getBeanType().getPackage().getName();

		// 根据包名判断是否是webservice，包名绑定
		if ( packageName.startsWith("org.blue.webservice")) {

			if (webApiconverter != null) {
				// 构建异常返回参数
				ResultModel model = new ResultModel();
				model.setResult(new Result());
				if (exception instanceof BaseException) {
					BaseException baseException = (BaseException) exception;
					model.getResult().setCode(baseException.getCode());
					// 增加详细参数
					if (!baseException.getDetails().isEmpty())
						model.setData(baseException.getDetails());
				} else
					model.getResult().setCode("9999");

				model.getResult().setMessage(exception.getMessage());

				return handleReturnValue(webApiconverter, handlerMethod, request, response, model);
			}
		}

		return super.doResolveHandlerMethodException(request, response, handlerMethod, exception);

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
	private ModelAndView handleResponseError(Exception exception, HandlerMethod handlerMethod, HttpServletRequest request, HttpServletResponse response) {

		if (exception instanceof IllegalStateException) {
			if (request.getSession(false) == null) {
				HttpSession session = request.getSession(true);
				if (session.isNew()) {
					// session过期,直接跳首页
					session.setAttribute("exceptionMsg", "登录已经过期，请重新登录");
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
				request.getSession().setAttribute("exceptionMsg", uiException.getMessage());
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

	/**
	 * Exception格式化成可以被客服的识别的信息
	 * 
	 * @param converter
	 * @param handlerMethod
	 * @param request
	 * @param response
	 * @param value
	 * @return
	 * @throws Exception
	 */
	private ModelAndView handleReturnValue(HandlerMethodReturnValueHandler converter, HandlerMethod handlerMethod, HttpServletRequest request, HttpServletResponse response, Object value)
			throws Exception {

		// 处理异常
		ServletWebRequest webRequest = new ServletWebRequest(request, response);
		ModelAndViewContainer mavContainer = new ModelAndViewContainer();
		webApiconverter.handleReturnValue(value, handlerMethod.getReturnType(), mavContainer, webRequest);
		ModelAndView mav = new ModelAndView().addAllObjects(mavContainer.getModel());
		mav.setViewName(mavContainer.getViewName());
		if (!mavContainer.isViewReference())
			mav.setView((View) mavContainer.getView());
		return mav;
	}

	// api处理器，从外面注入进来，暂时没啥好办法
	public void setWebApiProcessor(WebApiMethodResultConverter converter) {
		this.webApiconverter = converter;
	}

}
