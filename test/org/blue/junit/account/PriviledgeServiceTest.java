package org.blue.junit.account;

import javax.annotation.Resource;

import org.blue.junit.SpringTestRollBackBase;
import org.blue.sys.account.service.PrivilegeService;
import org.junit.Test;


public class PriviledgeServiceTest extends SpringTestRollBackBase {

	@Resource
	PrivilegeService privilegeService;
	
	@Test
	public void hasPermission()
	{
		privilegeService.hasRolePermission(1, "read", "userlist");
	}
}
