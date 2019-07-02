package org.blue.webframework.sys.siteparameter.dao;

import java.util.List;

import org.blue.webframework.sys.siteparameter.model.SiteParameter;
import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;

import com.github.pagehelper.Page;


public interface SiteParameterMapper {
	/**
	 * 根据id删除参数
	 * @param paramId 网站参数id
	 * @return 受影响的行数
	 */
    int deleteByPrimaryKey(int paramId);

	/**
	 * 插入网站参数记录
	 * @param record 网站参数记录
 	 * @return 受影响的行数
	 */
	int insert(SiteParameter record);

	/**
	 * 插入网站参数记录
	 * @param record  网站参数记录
	 * @return 受影响的行数
	 */
    int insertSelective(SiteParameter record);

	/**
	 * 根据id查询网站记录
	 * @param paramId 网站id
	 * @return 匹配的网站数据，如果没有匹配的数据，则返回null
	 */
	SiteParameter selectByPrimaryKey(int paramId);

	/**
	 * 根据参数名查询网站记录
	 * @param paramName 参数名
	 * @return 匹配的网站数据，如果没有匹配的数据，则返回null
	 */
	SiteParameter selectByName(String paramName);

	/**
	 * 根据id修改网站参数数据
	 * @param record 网站参数记录
	 * @return 受影响的行数
	 */
    int updateByPrimaryKeySelective(SiteParameter record);

	/**
	 * 根据id修改网站参数数据
	 * @param record 网站参数记录
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(SiteParameter record);

	/**
	 * 根据标签是否存在及参数名查询参数值
	 * @param paramName 参数名
	 * @return 参数值
	 */
    String getParamValueByName(String paramName);

	/**
	 * 根据标签是否存在查询参数名与参数值
	 * @return 匹配的网站数据的集合
	 */
	List<SiteParameter> querySiteParameterList();

	/**
	 * 根据参数名修改参数值
	 * @param makeSiteParameter 网站参数名
	 * @return 受影响的行数
	 */
	int modifySiteParameterValueByName(SiteParameter makeSiteParameter);

	/**
	 * 删除表
	 * @return 受影响的行数
	 */
	int dropTable();

	/**
	 * 清空表
	 * @return 受影响的行数
	 */
	int truncateTable();

	/**
	 * 创建表
	 * @return 受影响的行数
	 */
	int createTable();

	/**
	 *
	 * @param value 参数值
	 * @return 参数名
	 */
	Page<SiteParameterVo> selectList(String value);
}