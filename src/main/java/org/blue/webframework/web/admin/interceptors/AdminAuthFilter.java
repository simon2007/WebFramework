package org.blue.webframework.web.admin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.blue.webframework.utils.ServerHelper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminAuthFilter implements HandlerInterceptor {
	private final Logger logger = Logger.getLogger(AdminAuthFilter.class);


	private final PrivilegeService privilegeService;

	public AdminAuthFilter(PrivilegeService privilegeService) {
		this.privilegeService=privilegeService;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("request请求地址path[" + request.getServletPath() + "] uri[" + request.getRequestURI() + "]");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String servletPath=request.getServletPath();
		logger.info("request preHandle请求地址path[" + servletPath + "] uri[" + request.getRequestURI() + "]");
		HttpSession session = request.getSession();
		Long userId = ServerHelper.getCurrentAccountId(session);
		Long roleId = ServerHelper.getCurrentRoleId(session);
		if (userId == null || userId <= 0) {
			session.setAttribute("msg", "请重新登录");
			response.sendRedirect(request.getContextPath()+"/admin/login");
			return false;
		}
		
		if(!privilegeService.hasUserPermission(userId, "read", servletPath) && ! privilegeService.hasRolePermission(roleId, "read", servletPath))
		{
			session.setAttribute("msg", "没有权限访问");
			response.sendError(HttpServletResponse.SC_FORBIDDEN, "没有权限访问");
			return false;
		}

		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

}
