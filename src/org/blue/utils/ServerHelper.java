package org.blue.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 服务
 * @author Long
 *
 */
public class ServerHelper {
	/**
	 * 获取scheme
	 * @param request
	 * @return
	 */
	public static String getHttpScheme(HttpServletRequest request) {
		//获取与tengine中的scheme，如果没有则用默认的
		String scheme = request.getHeader("X-Forwarded-Scheme");
		if (StringHelper.isNullOrEmpty(scheme))
			scheme = request.getScheme();
		return scheme;
	}

	/**
	 * 全路径
	 * @param request
	 * @param path
	 * @return
	 */
	public static String getFullpath(HttpServletRequest request, String path) {

		StringBuffer sb = new StringBuffer();
		sb.append(getHttpScheme(request));
		sb.append("://");
		sb.append(request.getServerName());
		//如果是开发环境加上端口
		if( request.getServerPort() !=80 ){
			sb.append(":");
			sb.append(request.getServerPort());
		}
		sb.append(request.getContextPath());
		sb.append(path);
		return sb.toString();

	}
}
