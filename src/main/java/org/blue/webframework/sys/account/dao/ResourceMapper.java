package org.blue.webframework.sys.account.dao;

import org.blue.webframework.sys.account.model.Resource;
import org.springframework.stereotype.Repository;

/**
 * 资源管理的持久层
 */
@Repository
public interface ResourceMapper {
	
	/**
	 * 根据id查询资源信息
	 * @param id 资源信息id
	 * @return 匹配的资源信息数据，如果没有匹配的数据，则返回null
	 */
    Resource selectByPrimaryKey(int id);

	/**
	 * 根据id删除资源数据
	 * @param id id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int id);

	/**
	 * 增加新的资源数据
	 * @param resource 资源数据
	 * @return 受影响的行数
	 */
	int insert(Resource resource);

	/**
	 * 增加新的资源数据
	 * @param resource 资源数据
	 * @return 受影响的行数
	 */
	int insertSelective(Resource resource);

	/**
	 * 根据id更新资源数据
	 * @param resource 资源数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Resource resource);

	/**
	 * 根据id更新资源数据
	 * @param resource 资源数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(Resource resource);

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
	 * 根据资源编码查询资源数据
	 * @param resourceCode
	 * @return 匹配的资源信息数据，如果没有匹配的数据，则返回null
	 */
	Resource selectByCode(String resourceCode);
}
