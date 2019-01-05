package org.blue.sys.account.service;

import org.blue.sys.account.vo.RoleVo;

public interface RoleService {
	RoleVo getById(long id);

	int add(RoleVo admin);

	int update(RoleVo user);

}
