package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.RoleResource;
import org.springframework.stereotype.Repository;

/**
 * 角色资源数据的持久层
 */
@Repository
public interface RoleResourceMapper {

	/**
	 * 根据id查询角色资源数据
	 * @param id id
	 * @return 角色资源数据
	 */
	RoleResource selectByPrimaryKey(int id);

	/**
	 * 根据id删除角色资源数据
	 * @param id id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int id);
	
	/**
	 * 插入角色资源信息
	 * @param role 角色
	 * @return 受影响的行数
	 */
	int insert(RoleResource role);

	/**
	 * 根据id更新角色资源
	 * @param roleResource 角色资源数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(RoleResource roleResource);

	/**
	 * 根据操作、角色id 获取角色数量
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceId 资源id
	 * @return 匹配的角色数量
	 */
	int getCount(@Param("roleId") int roleId,@Param("operate")String operate,@Param("resourceId")int resourceId);

	/**
	 * 根据资源编码、操作、角色id查询匹配的角色资源数
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 * @return 匹配的角色资源数
	 */
	int getCountWidthCode(@Param("roleId") int roleId,@Param("operate")String operate,@Param("resourceCode")String resourceCode);

	/**
	 * 根据角色id、操作、资源编码模糊查找匹配的角色资源数
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceName 资源编码
	 * @return 匹配的角色资源数
	 */
	int getCountWidthName(@Param("roleId")int roleId,@Param("operate") String operate,@Param("resourceName") String resourceName);

	/**
	 * 根据资源id、操作、角色id删除角色资源数据
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceId 资源id
	 * @return 受影响的行数
	 */
	int delete(@Param("roleId") int roleId,@Param("operate")String operate,@Param("resourceId")int resourceId);

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

}
