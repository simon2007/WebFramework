package org.blue.framework;

import javax.servlet.ServletContext;

import org.blue.utils.Constants;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

public class BlueContextLoaderListener extends ContextLoaderListener {

	@Override
	protected WebApplicationContext createWebApplicationContext(ServletContext sc) {
		WebApplicationContext webContext= super.createWebApplicationContext(sc);
		Constants.setServletContext(sc);
		return webContext;
	}
}
