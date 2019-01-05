package org.blue.sys.siteparameter.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.blue.exception.BusinessException;
import org.blue.sys.siteparameter.dao.SiteParameterMapper;
import org.blue.sys.siteparameter.model.SiteParameter;
import org.blue.sys.siteparameter.service.SiteParameterService;
import org.blue.sys.siteparameter.vo.SiteParameterVo;
import org.blue.utils.StringHelper;
import org.springframework.stereotype.Service;



/************************************************
 * @All right reserved.
 * @Create Date: 2012-8-16 21:08:00
 * @Create Author: Long
 * @File Name: SiteParameterServiceImpl
 * @Last version: 1.0
 * @Function:对网站参数表进行操作的服务类接口实现.<br> 此类主要实现了：网站参数的增加、修改、删除、查询、详细.<br>
 * @Last Update Date:
 * @Change Log:
 **************************************************/
@Service("SiteParameterService")
public class SiteParameterServiceImpl implements SiteParameterService {

	@Resource
	private SiteParameterMapper siteParameterMapper;

	/**
	 * 根据参数名称取得参数值.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @Author zhanfuchun@itonghui.org
	 * @param paramName
	 *            根据网站参数名称获取网站参数值.<br>
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
	 * @Author zhanfuchun@itonghui.org
	 * @param paramName
	 *            根据网站参数名称获取网站参数值.<br>
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
	 * @param siteParameterVo
	 *            封装网站参数信息的对象.<br>
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
	 * @Author zhanfuchun@itonghui.org
	 * @param siteParameterVo
	 *            添加的参数内容
	 * @return String
	 */
	private void checkSiteParameter(SiteParameterVo siteParameterVo) {
		if (siteParameterVo == null) {
			return ;
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
	 * @Author zhanfuchun@itonghui.org
	 * @param siteParameterVo
	 *            查询条件
	 * @return SiteParameter
	 */
	private SiteParameter makeSiteParameter(SiteParameterVo siteParameterVo) {
		if (siteParameterVo == null)throw new BusinessException("0011");
		SiteParameter siteParameter = new SiteParameter();

		return siteParameter;
	}




	/**
	 * 根据网站参数主键删除网站参数信息.<br>
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @Author zhanfuchun@itonghui.org
	 * @param siteParameterId
	 *            网站参数主键.<br>
	 * @return int 0 表示删除失败， 1 表示删除成功.<br>
	 */
	@Override
	public int deleteSiteParameterById(int siteParameterId) {

		return siteParameterMapper.deleteByPrimaryKey(siteParameterId);
		
	}

	

	/**
	 * 根据网站参数名修改网站参数值.<br>
	 * 
	 * @param siteParameterVo
	 *            修改网站参数信息对象
	 * 
	 * @return int 0 表示修改失败， 1 表示修改成功.<br>
	 */
	@Override
	public int modifySiteParameterValueByName(SiteParameterVo siteParameterVo) {
		return siteParameterMapper.modifySiteParameterValueByName(makeSiteParameter(siteParameterVo));
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
	public int modifySiteParameter(SiteParameterVo siteParameterVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SiteParameterVo getSiteParameterById(int siteParameterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTable() {
		siteParameterMapper.createTable();
		
	}


}
