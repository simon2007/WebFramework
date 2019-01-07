package org.blue.webframework.junit.account;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.account.service.PrivilegeService;
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
