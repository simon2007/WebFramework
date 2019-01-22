package org.blue.webframework.web.admin.interceptors;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

public class CSRFFilter implements HandlerInterceptor {
	private final Logger logger = Logger.getLogger(CSRFFilter.class);

	private String createToken() {
		return UUID.randomUUID().toString();

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Object objToken = request.getSession().getAttribute("token");
		if (objToken == null) {
			logger.debug("set new token");
			objToken = createToken();
			request.getSession().setAttribute("token", createToken());
		}
		if ("post".equalsIgnoreCase(request.getMethod())) {

			String tokenFromUser = request.getParameter("token");
			logger.debug("token="+objToken  + " tokenFromUser="+tokenFromUser);
			if (tokenFromUser == null || tokenFromUser.length() <= 0) {
				response.sendError(HttpServletResponse.SC_FORBIDDEN, "Empty Token");
				return false;
			}
			if (!tokenFromUser.equals(objToken)) {
				response.sendError(HttpServletResponse.SC_FORBIDDEN, "Error Token");
				return false;
			}
		}
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
