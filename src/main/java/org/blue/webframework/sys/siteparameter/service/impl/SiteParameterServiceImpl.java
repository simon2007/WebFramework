package org.blue.webframework.sys.siteparameter.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.siteparameter.dao.SiteParameterMapper;
import org.blue.webframework.sys.siteparameter.model.SiteParameter;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;
import org.blue.webframework.utils.StringHelper;
import org.springframework.stereotype.Service;

/************************************************
 * @All right reserved.
 * @Create Date: 2012-8-16 21:08:00
 * @Create Author: Long
 * @File Name: SiteParameterServiceImpl
 * @Last version: 1.0
 * @Function:对网站参数表进行操作的服务类接口实现.<br>
 * 									此类主要实现了：网站参数的增加、修改、删除、查询、详细.<br>
 * @Last Update Date:
 * @Change Log:
 **************************************************/
@Service("SiteParameterService")
class SiteParameterServiceImpl implements SiteParameterService {

	@Resource
	private SiteParameterMapper siteParameterMapper;

	/**
	 * 根据参数名称取得参数值.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param paramName 根据网站参数名称获取网站参数值.<br>
	 * @return String 网站参数值.<br>
	 */
	@Override
	public String getParamValue(String paramName) {
		if (StringHelper.isBlank(paramName)) {
			throw new BusinessException("0011");
		}

		return siteParameterMapper.getParamValueByName(paramName);
	}

	/**
	 * 根据参数名称取得参数值.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param paramName 根据网站参数名称获取网站参数值.<br>
	 * @return String 网站参数值.<br>
	 */
	@Override
	public String getParamValue(String paramName, String defaultValue) {
		String value = siteParameterMapper.getParamValueByName(paramName);
		return value;
	}

	/**
	 * 保存网站参数信息.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param siteParameterVo 封装网站参数信息的对象.<br>
	 * @return int 0 表示保存失败， 1 表示保存成功.<br>
	 */
	@Override
	public int saveSiteParameter(SiteParameterVo siteParameterVo) {
		if (siteParameterVo == null) {
			throw new BusinessException("0011");
		}
		checkSiteParameter(siteParameterVo);
		return siteParameterMapper.insertSelective(makeSiteParameter(siteParameterVo));
	}

	/**
	 * 检查添加的参数内容是否正常
	 *
	 * @Date Jul 22, 2014 8:55:37 PM
	 * @param siteParameterVo 添加的参数内容
	 * @return String
	 */
	private void checkSiteParameter(SiteParameterVo siteParameterVo) {
		if (siteParameterVo == null) {
			return;
		}

		if (siteParameterVo.getParamName() == null)
			throw new BusinessException("0011");

		if (siteParameterVo.getParamValue() == null)
			throw new BusinessException("0011");

	}

	/**
	 * 将SiteParameterVo 转化成 SiteParameter.
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param siteParameterVo 查询条件
	 * @return SiteParameter
	 */
	private SiteParameter makeSiteParameter(SiteParameterVo siteParameterVo) {
		if (siteParameterVo == null)
			throw new BusinessException("0011");
		SiteParameter siteParameter = new SiteParameter();
		siteParameter.setParamComment(siteParameterVo.getParamComment());
		siteParameter.setParamName(siteParameterVo.getParamName());
		siteParameter.setParamId(siteParameterVo.getParamId());
		siteParameter.setParamValue(siteParameterVo.getParamValue());
		siteParameter.setRemoveTag(0);
		return siteParameter;
	}

	/**
	 * 根据网站参数主键删除网站参数信息.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param siteParameterId 网站参数主键.<br>
	 * @return int 0 表示删除失败， 1 表示删除成功.<br>
	 */
	@Override
	public int deleteSiteParameterById(int siteParameterId) {

		return siteParameterMapper.deleteByPrimaryKey(siteParameterId);

	}

	@Override
	public int getParamValue(String paramName, int defaultValue) {
		String value = getParamValue(paramName, (String) null);
		if (StringHelper.isBlank(value))
			return defaultValue;
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	@Override
	public long getParamValue(String paramName, long defaultValue) {
		String value = getParamValue(paramName, (String) null);
		if (StringHelper.isBlank(value))
			return defaultValue;
		try {
			return Long.parseLong(value);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	@Override
	public Date getParamValue(String paramName, Date defaultValue) {
		String value = getParamValue(paramName, (String) null);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (StringHelper.isBlank(value))
			return defaultValue;
		try {
			return sdf.parse(value);
		} catch (ParseException e) {
			return defaultValue;
		}
	}

	@Override
	public SiteParameterVo getSiteParameterById(int siteParameterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recreateTable() {
		siteParameterMapper.dropTable();
		siteParameterMapper.createTable();

	}

	@Override
	public void putParamValue(String paramName, int value) {

	}

	@Override
	public void putParamValue(String paramName, long value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putParamValue(String paramName, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putParamValue(String paramName, Date value) {
		// TODO Auto-generated method stub

	}

}
