package org.blue.webframework.framework.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blue.webframework.utils.ServerHelper;

import org.springframework.web.servlet.view.RedirectView;

/**
 * 自定义跳转
 * 
 * @author Lilongwu
 *
 */
public class BlueRedirectView extends RedirectView {

	public BlueRedirectView(String url) {
		super(url);
	}

	@Override
	protected void sendRedirect(HttpServletRequest request, HttpServletResponse response, String targetUrl, boolean http10Compatible) throws IOException {
		if (!targetUrl.startsWith("http://") && !targetUrl.startsWith("https://")) {
			// 相对路径，转换为全路径
			targetUrl = ServerHelper.getFullpath(request, targetUrl);
		}
		//重定向
		super.sendRedirect(request, response, targetUrl, http10Compatible);
	}
}
