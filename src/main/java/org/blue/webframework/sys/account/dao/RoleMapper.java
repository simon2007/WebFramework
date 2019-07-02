package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Role;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;

/**
 * 处理角色数据的持久层
 */
@Repository
public interface RoleMapper {

	/**
	 * 根据id查询的角色数据
	 * @param role 角色数据
	 * @return 匹配的角色数据，如果没有匹配的数据，则返回null
	 */
    Page<Role> selectAll(Role role);

	/**
	 * 根据id查询的角色数据
	 * @param id id
	 * @return 匹配的角色数据，如果没有匹配的数据，则返回null
	 */
	Role selectByPrimaryKey(int id);

	/**
	 * 根据id删除角色数据
	 * @param id id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int id);

	/**
	 * 插入角色数据
	 * @param role 角色数据
	 * @return 受影响的行数
	 */
	int insert(Role role);

	/**
	 * 插入角色数据
	 * @param role 角色数据
	 * @return 受影响的行数
	 */
	int insertSelective(Role role);

	/**
	 * 根据id更新角色数据
	 * @param role 角色数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Role role);

	/**
	 * 根据id更新角色数据
	 * @param role 角色数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(Role role);

	/**
	 * 根据id设置是否启用权限
	 * @param id id
	 * @param enable 是否启用
	 * @return 受影响的行数
	 */
	int setEnable(@Param("id") int id,@Param("enable")boolean enable);

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
