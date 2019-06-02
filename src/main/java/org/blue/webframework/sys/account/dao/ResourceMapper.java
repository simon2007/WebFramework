package org.blue.webframework.sys.account.dao;

import org.blue.webframework.sys.account.model.Resource;
public interface ResourceMapper {

    Resource selectByPrimaryKey(long id);

	int deleteByPrimaryKey(long id);

	/**
	 * 插入资源信息
	 * @param resource 资源信息
	 * @return 受影响的行数
	 */
	int insert(Resource resource);

	int insertSelective(Resource resource);

	int updateByPrimaryKeySelective(Resource resource);

	int updateByPrimaryKey(Resource resource);
	
	int dropTable();

	int truncateTable();

	int createTable();
	
	Resource selectByCode(String resourceCode);
}
