package org.blue.webframework.sys.template.service;

import java.util.Locale;
import java.util.Map;

/**
 * 模板类
 * @author Lilongwu
 *
 */
public interface TemplateService {

	/**
	 * 根据view的名字生成
	 * @param viewName
	 * @param map
	 * @return 生成的内容
	 */
	String processViewTemplate(String viewName, Map<String,  Object> variables,Locale locale);
	
	String processViewTemplate(String viewName, Map<String,  Object> variables);

	String processUrlTemplate(String url, Map<String, Object> data);
}
