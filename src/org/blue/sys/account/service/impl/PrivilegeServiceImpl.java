package org.blue.sys.account.service.impl;

import org.blue.sys.account.service.PrivilegeService;
import org.springframework.stereotype.Service;

@Service("PrivilegeService")
public class PrivilegeServiceImpl implements PrivilegeService {

	@Override
	public boolean hasRolePermission(long roleId, String operate, String resourceCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasUserPermission(long userId, String operate, String resourceCode) {
		// TODO Auto-generated method stub
		return false;
	}

}
