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
	 * @return
	 * @throws Exception
	 */
	public String processViewTemplate(String viewName, Map<String,? extends Object> map);
	/**
	 * 根据url去生成
	 * @param url
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public String processUrlTemplate(String url, MultiValueMap<String, String> map);
	
	public String processUrlTemplate(String url, Map<String, ? extends Object> map);
}
