package org.blue.webframework.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.blue.webframework.sys.account.vo.AccountVo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 服务
 * 
 * @author Long
 *
 */
public class ServerHelper {
	/**
	 * 获取scheme
	 * 
	 * @param request
	 * @return
	 */
	public static String getHttpScheme(HttpServletRequest request) {
		// 获取与tengine中的scheme，如果没有则用默认的
		String scheme = request.getHeader("X-Forwarded-Scheme");
		if (StringHelper.isNullOrEmpty(scheme))
			scheme = request.getScheme();
		return scheme;
	}

	/**
	 * 全路径
	 * 
	 * @param request
	 * @param path
	 * @return
	 */
	public static String getFullpath(HttpServletRequest request, String path) {

		StringBuffer sb = new StringBuffer();
		sb.append(getHttpScheme(request));
		sb.append("://");
		sb.append(request.getServerName());
		// 如果是开发环境加上端口
		if (request.getServerPort() != 80) {
			sb.append(":");
			sb.append(request.getServerPort());
		}
		sb.append(request.getContextPath());
		sb.append(path);
		return sb.toString();

	}

	public static HttpServletRequest getRequest() {
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		if (servletRequestAttributes == null)
			return null;
		return servletRequestAttributes.getRequest();
	}

	public static HttpSession getSession() {
		HttpServletRequest request = getRequest();
		if (request == null)
			return null;
		return request.getSession();
	}

	public static final String CurrentAccountKey = "__currentAccount__";

	public static Long getCurrentAccountId() {
		HttpSession session = getSession();
		return getCurrentAccountId(session);
	}

	public static void setCurrentAccount(HttpSession session, AccountVo account) {
		session.setAttribute(CurrentAccountKey, account);
	}

	public static AccountVo getCurrentAccount(HttpSession session) {
		AccountVo account = (AccountVo) session.getAttribute(CurrentAccountKey);
		return account;
	}

	/**
	 * 从session中获取用户数据
	 * @param session
	 * @return 用户id
	 */
	public static Long getCurrentAccountId(HttpSession session) {
		AccountVo account = getCurrentAccount(session);
		if (account == null)
			return null;
		return account.getId();
	}

	public static Long getCurrentRoleId(HttpSession session) {
		AccountVo account = getCurrentAccount(session);
		if (account == null)
			return null;
		return account.getRoleId();
	}

	public static Long getCurrentRoleId() {
		HttpSession session = getSession();

		return getCurrentRoleId(session);
	}

	public static String getCurrentCurrentAccountName(HttpSession session) {
		AccountVo account = getCurrentAccount(session);
		if (account == null)
			return null;
		return account.getName();
	}
	
}
