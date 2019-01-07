package org.blue.webframework.sys.template.http;

import javax.servlet.ServletContext;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;

public class ServerHttpServletRequest extends MockHttpServletRequest {

	public ServerHttpServletRequest(ServletContext servletContext) {
		super(servletContext);
		setCharacterEncoding("UTF-8");
		setMethod(HttpMethod.POST.toString());
		setContentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		addHeader("UserAgent", "BlueTemplate/1.0.0");
		addHeader("Accept", MediaType.TEXT_HTML_VALUE);
	}
}
