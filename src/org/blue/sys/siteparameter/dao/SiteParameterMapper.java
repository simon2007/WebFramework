package org.blue.sys.siteparameter.dao;

import java.util.List;

import org.blue.sys.siteparameter.model.SiteParameter;


public interface SiteParameterMapper {
    int deleteByPrimaryKey(int paramId);

    int insert(SiteParameter record);

    int insertSelective(SiteParameter record);

    SiteParameter selectByPrimaryKey(int paramId);

    int updateByPrimaryKeySelective(SiteParameter record);

    int updateByPrimaryKey(SiteParameter record);
    
    String getParamValueByName(String paramName);
    
	List<SiteParameter> querySiteParameterList();

	int modifySiteParameterValueByName(SiteParameter makeSiteParameter);
	
	int createTable();
}