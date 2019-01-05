package org.blue.webframework.utils;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class Constants {

	private static ServletContext servletContext;

	/**
	 * 获取ServletContext
	 * 
	 * @return
	 */
	public static ServletContext getServletContext() {
		if (servletContext == null) {
			WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
			if (context != null)
				servletContext = context.getServletContext();
		}
		return servletContext;
	}

	public static void setServletContext(ServletContext context) {
		servletContext = context;
	}

}
