package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.RoleVo;

/**
 * 角色管理
 * @author Lilongwu
 *
 */
public interface RoleService {

	/**
	 * 根据用户id查询该角色的信息
	 * @param id id
	 * @return 角色数据
	 */
	RoleVo getById(int id);

	/**
	 * 添加角色信息
	 * @param admin 角色数据
	 * @return 受影响的行数
	 */
	int add(RoleVo admin);

	/**
	 * 根据id更新角色数据
	 * @param user 角色数据
	 * @return 受影响的行数
	 */
	int update(RoleVo user);

	/**
	 * 删除与创建表
	 */
	void recreateTable();
}
