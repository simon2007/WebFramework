package org.blue.webframework.sys.account.dao;

import org.blue.webframework.sys.account.model.Resource;
public interface ResourceMapper {

    Resource selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(Resource resource);
	int insertSelective(Resource resource);
	int updateByPrimaryKeySelective(Resource resource);
	int updateByPrimaryKey(Resource resource);
	
	int dropTable();
	int truncateTable();
	int createTable();
	
	Resource selectByCode(String resourceCode);
}
