package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.RoleVo;

/**
 * 角色管理
 * @author long
 *
 */
public interface RoleService {
	RoleVo getById(long id);

	int add(RoleVo admin);

	int update(RoleVo user);

	void recreateTable();
}
