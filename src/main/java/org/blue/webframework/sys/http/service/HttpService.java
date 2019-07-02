package org.blue.webframework.sys.http.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;

import com.alibaba.fastjson.JSONObject;

/**
 * http请求服务
 * @author Lilongwu
 *
 */
public interface HttpService {
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 * @exception IOException
	 */
	String post(String sendUrl, List<? extends NameValuePair> sendParam) throws IOException;
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 * @exception IOException
	 */
	String post(String sendUrl, Map<String,String> sendParam) throws IOException;
	
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param sendParam
	 * @return
	 * @exception IOException
	 */
	String post(String sendUrl, JSONObject sendParam) throws IOException;
	
	/**
	 * post请求
	 * @param sendUrl
	 * @param entity
	 * @return
	 * @exception IOException
	 */
	String postXml(String sendUrl, Object entity) throws IOException;
	
	/**
	 * 
	 * @param sendUrl
	 * @return
	 * @exception IOException
	 */
	String post(String sendUrl) throws IOException;
	
	/**
	 * get请求
	 * @param sendUrl
	 * @return
	 * @exception IOException
	 */
	String get(String sendUrl) throws IOException;
	
}
