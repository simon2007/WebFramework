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
	public boolean hasAccountPermission(long accountId, String operate, String resourceCode) {
		return roleResourceMapper.getCountWidthCode(accountId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasRolePermissionWithName(long roleId, String operate, String resourceName) {
		return roleResourceMapper.getCountWidthName(roleId, operate, resourceName)>0;
	}

	@Override
	public boolean hasAccountPermissionWithName(long accountId, String operate, String resourceName) {
		return accountResourceMapper.getCountWidthName(accountId, operate, resourceName)>0;
	}

}
