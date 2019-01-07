package org.blue.webframework.junit.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.account.service.RoleService;
import org.blue.webframework.sys.account.vo.RoleVo;
import org.junit.Before;
import org.junit.Test;



public class ResourceServiceTest extends SpringTestRollBackBase {

	@Resource
	private RoleService roleService;
	
	RoleVo admin;

	@Before
	public void init() {
		admin = new RoleVo();

		admin.setId(1);
		admin.setName("admin");
		admin.setEnable(true);

		roleService.add(admin);

	}

	@Test
	public void userGetByIdTest() {
		RoleVo dbUserVo = roleService.getById(admin.getId());
		assertNotNull(dbUserVo);
		assertEquals(dbUserVo.getName(), admin.getName());
		assertEquals(dbUserVo.getEnable(), admin.getEnable());

	}

	@Test
	public void userInsertTest() {

		RoleVo user = new RoleVo();

		user.setName("name");
		user.setEnable(true);
	
		roleService.add(user);

		user.setName("user1");

		
		roleService.update(user);

		RoleVo dbUserVo = roleService.getById(user.getId());
		assertEquals(dbUserVo.getName(), user.getName());
		assertEquals(dbUserVo.getEnable(), user.getEnable());

	}

}
