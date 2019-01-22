package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.dao.AccountResourceMapper;
import org.blue.webframework.sys.account.dao.RoleResourceMapper;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.springframework.stereotype.Service;

@Service("PrivilegeService")
class PrivilegeServiceImpl implements PrivilegeService {
	@Resource
	private AccountResourceMapper accountResourceMapper;
	
	@Resource
	private RoleResourceMapper roleResourceMapper;
	
	@Override
	public boolean hasRolePermission(long roleId, String operate, String resourceCode) {

		return accountResourceMapper.getCountWidthCode(roleId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasUserPermission(long userId, String operate, String resourceCode) {
		return roleResourceMapper.getCountWidthCode(userId, operate, resourceCode)>0;
	}

}
