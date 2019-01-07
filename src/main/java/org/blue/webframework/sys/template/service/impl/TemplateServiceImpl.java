package org.blue.webframework.sys.template.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;

import org.blue.webframework.exception.SystemException;
import org.blue.webframework.sys.template.http.ServerHttpServletRequest;
import org.blue.webframework.sys.template.http.ServerHttpServletResponse;
import org.blue.webframework.sys.template.service.TemplateService;
import org.blue.webframework.utils.Constants;
import org.blue.webframework.utils.StringHelper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Service("TemplateService")
class TemplateServiceImpl implements TemplateService,ApplicationContextAware {

	private InternalResourceViewResolver viewResolver;
	private Logger logger = LogManager.getLogger(getClass());

	public InternalResourceViewResolver getViewResolver(){
		
		if( viewResolver == null ) {
			viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			viewResolver.setServletContext(Constants.getServletContext());
			viewResolver.setApplicationContext(applicationContext);
			viewResolver.setAlwaysInclude(true);
			viewResolver.setContentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		}
		
		return viewResolver;
	}

	@Override
	public String processViewTemplate(String viewName, Map<String, ? extends Object> map) {
		if (StringHelper.isBlank(viewName))
			return "";

		ServletContext context = Constants.getServletContext();
		if (context == null) {
			logger.error("ServletContext is null");
			return "";
		}

		ServerHttpServletRequest request = new ServerHttpServletRequest(context);
		if (map != null) {
			for (String key : map.keySet()) {
				Object value = map.get(key);
				if (value != null)
					request.addParameter(key, value.toString());
			}
		}
		ServerHttpServletResponse response = new ServerHttpServletResponse(request);
		try {

			// 查找对应的view
			View view = getViewResolver().resolveViewName(viewName, Locale.CHINA);
			if (view == null)
				return "";
			// 渲染
			view.render(map, request, response);
			String content = response.getContentAsString();
			return content;
		} catch (Exception e) {
			throw new SystemException("0003", e);
		}
	}

	@Override
	public String processUrlTemplate(String url, MultiValueMap<String, String> map) {
		if (StringHelper.isBlank(url))
			return "";
		ServletContext context = Constants.getServletContext();
		if (context == null) {
			logger.error("ServletContext is null");
			return "";
		}
		ServerHttpServletRequest request = new ServerHttpServletRequest(context);
		if (map != null) {
			for (String key : map.keySet()) {
				List<String> values = map.get(key);
				if (values == null)
					continue;
				String[] value = new String[values.size()];
				values.toArray(value);
				request.addParameter(key, value);
			}
		}

		ServerHttpServletResponse response = new ServerHttpServletResponse(request);
		try {
			// 执行
			response.execute(url);
			String content = response.getContentAsString();
			return content;
		} catch (Exception e) {
			throw new SystemException("0003",  e);
		}

	}

	@Override
	public String processUrlTemplate(String url, Map<String, ? extends Object> map) {
		if (StringHelper.isBlank(url))
			return "";
		ServletContext context = Constants.getServletContext();
		if (context == null) {
			logger.error("ServletContext is null");
			return "";
		}
		ServerHttpServletRequest request = new ServerHttpServletRequest(context);
		if (map != null) {
			for (String key : map.keySet()) {
				Object value = map.get(key);
				if (value != null)
					request.addParameter(key, value.toString());
			}
		}
		ServerHttpServletResponse response = new ServerHttpServletResponse(request);
		try {
			response.execute(url);
			String content = response.getContentAsString();
			return content;
		} catch (Exception e) {
			throw new SystemException("0003", e);
		}
	}


	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}

}
