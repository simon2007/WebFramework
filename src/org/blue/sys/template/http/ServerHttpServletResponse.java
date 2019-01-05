package org.blue.sys.template.http;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;

public class ServerHttpServletResponse extends MockHttpServletResponse {
	private final HttpServletRequest request;

	public ServerHttpServletResponse(HttpServletRequest request)
	{
		this.request=request;
		setContentType(MediaType.TEXT_HTML_VALUE);
		setCharacterEncoding("utf-8");
	}
	
	
	@Override
	public void addIncludedUrl(String includedUrl) {
		try {
			execute(includedUrl);
		} catch (ServletException |IOException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
		super.addIncludedUrl(includedUrl);
	}
	
	public void execute(String url) throws ServletException, IOException
	{
		ServletContext servletContext=request.getServletContext();
		servletContext.getRequestDispatcher(url).include(request, this);
	}
}
