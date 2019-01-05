package org.blue.webframework.junit.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceTest extends SpringTestRollBackBase {

	@Autowired
	AccountService accountService;
	AccountVo admin;

	@Before
	public void init() {
		admin = new AccountVo();

		admin.setGroupId(1);
		admin.setName("admin");
		admin.setOpenId("openId");
		admin.setEnable(true);
		admin.setRoleId(1);

		accountService.add(admin, "123456");

	}

	@Test
	public void userGetByIdTest() {
		AccountVo dbUserVo = accountService.getUserById(admin.getId());
		assertNotNull(dbUserVo);
		assertEquals(dbUserVo.getName(), admin.getName());
		assertEquals(dbUserVo.getGroupId(), admin.getGroupId());
		assertEquals(dbUserVo.getOpenId(), admin.getOpenId());
		assertEquals(dbUserVo.getEnable(), admin.getEnable());
		assertEquals(dbUserVo.getRoleId(), admin.getRoleId());
	}

	@Test
	public void userInsertTest() {

		AccountVo user = new AccountVo();

		user.setGroupId(1);
		user.setName("name");
		user.setOpenId("aaa");
		user.setEnable(true);
		user.setRoleId(2);

		accountService.add(user, "password");

		user.setName("user1");
		user.setGroupId(2);
		user.setOpenId("email1");
		user.setRoleId(3);
		
		accountService.update(user);

		AccountVo dbUserVo = accountService.getUserById(user.getId());

		assertEquals(dbUserVo.getName(), user.getName());
		assertEquals(dbUserVo.getGroupId(), user.getGroupId());
		assertEquals(dbUserVo.getOpenId(), user.getOpenId());
		assertEquals(dbUserVo.getEnable(), user.getEnable());
		assertEquals(dbUserVo.getRoleId(), user.getRoleId());
	}

	@Test
	public void userLoginTest() {
		AccountVo dbUserVo = accountService.getByNameAndPassword("admin", "123456");
		assertNotNull(dbUserVo);
		assertEquals(dbUserVo.getName(), admin.getName());
		assertEquals(dbUserVo.getGroupId(), admin.getGroupId());
		assertEquals(dbUserVo.getOpenId(), admin.getOpenId());
		assertEquals(dbUserVo.getEnable(), admin.getEnable());
		assertEquals(dbUserVo.getRoleId(), admin.getRoleId());
	}
	
	@Test
	public void resetPasswordTest()
	{
		int ret=accountService.resetPassword("admin", "123456", "654321");
		assertEquals(ret,1);
	}

}
