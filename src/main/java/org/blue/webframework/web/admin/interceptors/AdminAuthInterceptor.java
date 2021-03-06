package org.blue.webframework.web.admin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.blue.webframework.utils.ServerHelper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 */
public class AdminAuthInterceptor implements HandlerInterceptor {
	//log4j日志
	private final Logger logger = Logger.getLogger(AdminAuthInterceptor.class);
	
	
	private final PrivilegeService privilegeService;
	
	public AdminAuthInterceptor(PrivilegeService privilegeService) {
		this.privilegeService=privilegeService;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//logger.info("request请求地址path[" + request.getServletPath() + "] uri[" + request.getRequestURI() + "]");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String servletPath=request.getServletPath();
		logger.info("path[" + servletPath + "] uri[" + request.getRequestURI() + "]");
		HttpSession session = request.getSession();
		Integer userId = ServerHelper.getCurrentAccountId(session);
		Integer roleId = ServerHelper.getCurrentRoleId(session);
		
		//判断用户是否登录
		if (userId == null || userId <= 0) {
			session.setAttribute("msg", "请重新登录");
			response.sendRedirect(request.getContextPath()+"/admin/login");
			//拦截
			return false;
		}
		
		//判断账户是否有权限
		if(!privilegeService.hasAccountPermissionWithName(userId, "read", servletPath) && ! privilegeService.hasRolePermissionWithName(roleId, "read", servletPath))
		{
			session.setAttribute("msg", "没有权限访问");
			response.sendError(HttpServletResponse.SC_FORBIDDEN, "没有权限访问");
			//拦截
			return false;
		}

		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

}
