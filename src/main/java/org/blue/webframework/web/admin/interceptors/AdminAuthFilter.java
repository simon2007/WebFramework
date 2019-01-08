package org.blue.webframework.web.admin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminAuthFilter implements HandlerInterceptor {
	private final Logger logger = Logger.getLogger(AdminAuthFilter.class);

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("request请求地址path["+request.getServletPath()+"] uri["+request.getRequestURI()+"]");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("request preHandle请求地址path["+request.getServletPath()+"] uri["+request.getRequestURI()+"]");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}


}
