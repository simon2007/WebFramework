package org.blue.webframework.sys.template.service;

import java.util.Map;

import org.springframework.util.MultiValueMap;

/**
 * 模板类
 * @author Long
 *
 */
public interface TemplateService {

	/**
	 * 根据view的名字生成
	 * @param viewName
	 * @param map
	 * @return 生成的内容
	 */
	public String processViewTemplate(String viewName, Map<String,? extends Object> map);
	/**
	 * 根据url去生成
	 * @param url url
	 * @param map 模板中的变量
	 * @return 生成的内容
	 */
	public String processUrlTemplate(String url, MultiValueMap<String, String> map);
	
	/**
	 * 根据url去生成
	 * @param url url
	 * @param map 模板中的变量
	 * @return 生成的内容
	 */
	public String processUrlTemplate(String url, Map<String, ? extends Object> map);
}
