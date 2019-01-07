package org.blue.webframework.sys.siteparameter.service;

import java.util.Date;

import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;

/************************************************
 * @All right reserved.
 * @Create Date: 2014-7-1 21:08:00
 * @Create Author: Lilongwu
 **************************************************/
public interface SiteParameterService {

	/**
	 * 根据参数名称取得参数值.<br>
	 * 
	 * @param paramName 根据网站参数名称获取网站参数值.<br>
	 * 
	 * @return String 网站参数值.<br>
	 */
	public String getParamValue(String paramName);

	/**
	 * 根据参数名称取得参数值.<br>
	 * 
	 * @param paramName 根据网站参数名称获取网站参数值.<br>
	 * @param defaultValue 默认值.<br>
	 * @return String 网站参数值.<br>
	 */
	public String getParamValue(String paramName,String defaultValue);
	
	/**
	 * 保存网站参数信息.<br>
	 * 
	 * @param siteParameterVo 封装网站参数信息的对象.<br>
	 *            
	 * @return int 0 表示保存失败， 1 表示保存成功.<br>
	 */
	public int saveSiteParameter(SiteParameterVo siteParameterVo);

	/**
	 * 根据网站参数主键删除网站参数信息.<br>
	 * 
	 * @param siteParameterId 网站参数主键.<br>
	 *            
	 * @return int 0 表示删除失败， 1 表示删除成功.<br>
	 */
	public int deleteSiteParameterById(int siteParameterId);
	
	/**
	 * 根据网站参数主键获取网站参数值.<br>
	 * 
	 * @param siteParameterId 网站参数主键.<br>
	 * 
	 * @return SiteParameterViewVo 单网站参数记录信息.<br>
	 */
	public SiteParameterVo getSiteParameterById(int siteParameterId);



	public void putParamValue(String paramName, int value);
	public void putParamValue(String paramName, long value);
	public void putParamValue(String paramName, String value);
	public void putParamValue(String paramName, Date value);
	
	/**
	 * 获取参数
	 * @param paramName
	 * @param defaultValue
	 * @return
	 */
	public int getParamValue(String paramName, int defaultValue);
	
	/**
	 * 获取参数
	 * @param paramName
	 * @param defaultValue
	 * @return
	 */
	public long getParamValue(String paramName, long defaultValue);
	
	/**
	 * 获取参数
	 * @param paramName
	 * @param defaultValue
	 * @return
	 */
	public Date getParamValue(String paramName, Date defaultValue);
	

	void recreateTable();
}
