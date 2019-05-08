package org.blue.webframework.sys.siteparameter.dao;

import java.util.List;

import org.blue.webframework.sys.siteparameter.model.SiteParameter;
import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;

import com.github.pagehelper.Page;


public interface SiteParameterMapper {
	/**
	 * 根据id删除参数
	 * @param paramId
	 * @return
	 */
    int deleteByPrimaryKey(int paramId);

    int insert(SiteParameter record);

    int insertSelective(SiteParameter record);

    SiteParameter selectByPrimaryKey(int paramId);
    SiteParameter selectByName(String paramName);

    int updateByPrimaryKeySelective(SiteParameter record);

    int updateByPrimaryKey(SiteParameter record);
    
    String getParamValueByName(String paramName);
    
	List<SiteParameter> querySiteParameterList();

	int modifySiteParameterValueByName(SiteParameter makeSiteParameter);
	
	int dropTable();
	int truncateTable();
	int createTable();

	Page<SiteParameterVo> selectList(String value);
}