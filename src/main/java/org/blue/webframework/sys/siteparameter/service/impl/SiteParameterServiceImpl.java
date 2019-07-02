package org.blue.webframework.sys.siteparameter.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.blue.webframework.exception.BusinessException;
import org.blue.webframework.sys.siteparameter.dao.SiteParameterMapper;
import org.blue.webframework.sys.siteparameter.model.SiteParameter;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;
import org.blue.webframework.utils.StringHelper;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

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
		if (StringHelper.isBlank(value))
			return defaultValue;
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

		if (siteParameterVo.getName() == null)
			throw new BusinessException("0011");

		if (siteParameterVo.getValue() == null)
			throw new BusinessException("0011");

	}

	/**
	 * 将SiteParameterVo 转化成 SiteParameter.
	 * 
	 * @Date Jul 10, 2014 4:18:31 PM
	 * @param siteParameterVo 查询条件
	 * @return SiteParameter
	 */
	private SiteParameterVo makeSiteParameterVo(SiteParameter siteParameter) {
		if (siteParameter == null)
			throw new BusinessException("0011");
		SiteParameterVo siteParameterVo = new SiteParameterVo();
		siteParameterVo.setComment(siteParameter.getComment());
		siteParameterVo.setName(siteParameter.getName());
		siteParameterVo.setId(siteParameter.getId());
		siteParameterVo.setValue(siteParameter.getValue());
		return siteParameterVo;
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
		siteParameter.setComment(siteParameterVo.getComment());
		siteParameter.setName(siteParameterVo.getName());
		siteParameter.setId(siteParameterVo.getId());
		siteParameter.setValue(siteParameterVo.getValue());
		siteParameter.setRemoveTag(false);
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

		if (StringHelper.isBlank(value))
			return defaultValue;
		try {
			return StringHelper.parseDate(value);
		} catch (ParseException e) {
			return defaultValue;
		}
	}

	@Override
	public SiteParameterVo getSiteParameterById(int siteParameterId) {
		return makeSiteParameterVo(siteParameterMapper.selectByPrimaryKey(siteParameterId));
	}

	@Override
	public void recreateTable() {
		siteParameterMapper.dropTable();
		siteParameterMapper.createTable();

	}

	@Override
	public void putParamValue(String paramName, int value, String comment) {
		putParamValue(paramName, String.valueOf(value), comment);
	}

	@Override
	public void putParamValue(String paramName, int value) {
		putParamValue(paramName, String.valueOf(value));
	}

	@Override
	public void putParamValue(String paramName, long value, String comment) {
		putParamValue(paramName, String.valueOf(value), comment);

	}

	@Override
	public void putParamValue(String paramName, long value) {
		putParamValue(paramName, String.valueOf(value));

	}

	@Override
	public void putParamValue(String paramName, String value) {
		//根据参数名查询网站记录
		SiteParameter siteParameter = siteParameterMapper.selectByName(paramName);
		if (siteParameter == null) {
			//为null值，则此前没有记录
			siteParameter = new SiteParameter();
			siteParameter.setName(paramName);
			siteParameter.setValue(value);
			siteParameter.setRemoveTag(false);
			//执行插入数据
			siteParameterMapper.insert(siteParameter);
		} else {
			//非null，此前已有该记录
			siteParameter.setValue(value);
			//执行修改
			siteParameterMapper.updateByPrimaryKeySelective(siteParameter);
		}
	}

	@Override
	public void putParamValue(String paramName, String value, String comment) {
		//根据参数名查询网站记录
		SiteParameter siteParameter = siteParameterMapper.selectByName(paramName);
		if (siteParameter == null) {
			//为null值，则此前没有记录
			siteParameter = new SiteParameter();
			siteParameter.setName(paramName);
			siteParameter.setValue(value);
			siteParameter.setRemoveTag(false);
			siteParameter.setComment(comment);
			//执行插入数据
			siteParameterMapper.insert(siteParameter);
		} else {
			//非null，此前已有该记录
			siteParameter.setValue(value);
			siteParameter.setComment(comment);
			//执行修改
			siteParameterMapper.updateByPrimaryKeySelective(siteParameter);
		}
	}

	@Override
	public void putParamValue(String paramName, Date value) {
		putParamValue(paramName, StringHelper.toString(value));

	}

	@Override
	public void putParamValue(String paramName, Date value, String comment) {
		putParamValue(paramName, StringHelper.toString(value), comment);

	}

	@Override
	public Page<SiteParameterVo> getParametersAsPage(String value, int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		return siteParameterMapper.selectList(value);
	}

	@Override
	public boolean getParamValue(String paramName, boolean defaultValue) {
		String value = getParamValue(paramName, (String) null);
		if (StringHelper.isBlank(value))
			return defaultValue;
		return Boolean.parseBoolean(value);
	}

}
