package org.blue.sys.http.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;

import com.alibaba.fastjson.JSONObject;

/**
 * http请求服务
 * @author Long
 *
 */
public interface HttpService {
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 */
	String post(String sendUrl, List<? extends NameValuePair> param) throws IOException;
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 */
	String post(String sendUrl, Map<String,String> param) throws IOException;
	
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 */
	String post(String sendUrl, JSONObject sendParam) throws IOException;
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param entity
	 * @return
	 */
	String postXml(String sendUrl, Object entity) throws IOException;
	
	/**
	 * 
	 * @param sendUrl
	 * @return
	 */
	String post(String sendUrl) throws IOException;
	
	/**
	 * get请求
	 * @param sendUrl
	 * @param backEncodType
	 * @return
	 */
	String get(String sendUrl) throws IOException;
	
}
