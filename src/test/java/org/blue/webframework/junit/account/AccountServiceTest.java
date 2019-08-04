package org.blue.webframework.junit.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.blue.webframework.junit.SpringTestBase;
import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.vo.AccountLoginVo;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.github.pagehelper.Page;

@Rollback(true)
public class AccountServiceTest extends SpringTestBase {

	@Autowired
	AccountService accountService;

	@Test
	public void userGetByIdTest() {
		AccountVo admin = new AccountVo();

		admin.setGroupId(1);
		admin.setName("hello_1");
		admin.setOpenId("WeiXin12");
		admin.setEnable(true);
		admin.setRoleId(1);

		accountService.add(admin, "hello123");
		System.out.println("id=" + admin.getId());
		AccountVo dbUserVo = accountService.getAccountById(admin.getId());
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
		user.setName("future");
		user.setOpenId("WeiXin11");
		user.setEnable(true);
		user.setRoleId(1);

		Integer row = accountService.add(user, "future123");
		System.err.println("userId=" + user.getId());

		user.setName("user1");
		user.setGroupId(2);
		user.setOpenId("email1");
		user.setRoleId(3);

		accountService.update(user);
		System.err.println("user.getId()=" + user.getId());
		AccountVo dbUserVo = accountService.getAccountById(user.getId());
		System.err.println("dbUserVo.getName()=" + dbUserVo.getName());
		System.err.println("user.getName()=" + user.getName());

		assertEquals(dbUserVo.getName(), user.getName());
		assertEquals(dbUserVo.getGroupId(), user.getGroupId());
		assertEquals(dbUserVo.getOpenId(), user.getOpenId());
		assertEquals(dbUserVo.getEnable(), user.getEnable());
		assertEquals(dbUserVo.getRoleId(), user.getRoleId());
	}

	@Test
	public void userLoginTest() {
		AccountVo admin = new AccountVo();

		admin.setGroupId(1);
		admin.setName("hello_2");
		admin.setOpenId("WeiXin12");
		admin.setEnable(true);
		admin.setRoleId(1);

		accountService.add(admin, "hello123");

		AccountLoginVo accoutLoginVo=new AccountLoginVo();
		accoutLoginVo.setName(admin.getName());
		accoutLoginVo.setPassword("hello123");
		AccountVo dbUserVo = accountService.login(accoutLoginVo);
		assertNotNull(dbUserVo);
		assertEquals(dbUserVo.getName(), admin.getName());
		assertEquals(dbUserVo.getGroupId(), admin.getGroupId());
		assertEquals(dbUserVo.getOpenId(), admin.getOpenId());
		assertEquals(dbUserVo.getEnable(), admin.getEnable());
		assertEquals(dbUserVo.getRoleId(), admin.getRoleId());
	}

	@Test
	public void resetPasswordTest() {
		AccountVo admin = new AccountVo();
		admin.setGroupId(1);
		admin.setName("hello_3");
		admin.setOpenId("WeiXin12");
		admin.setEnable(true);
		admin.setRoleId(1);

		accountService.add(admin, "hello123");

		//int ret = accountService.resetPassword(admin.getName(), "hello123", "hello123");
		//assertEquals(ret, 1);
	}

	@Test
	public void getByNameAndPassword() {
		AccountVo admin = new AccountVo();

		admin.setGroupId(1);
		admin.setName("hello_4");
		admin.setOpenId("WeiXin12");
		admin.setEnable(true);
		admin.setRoleId(1);

		accountService.add(admin, "hello123");

		AccountLoginVo accoutLoginVo=new AccountLoginVo();
		accoutLoginVo.setName(admin.getName());
		accoutLoginVo.setPassword("hello123");
		AccountVo result = accountService.login(accoutLoginVo);
		System.err.println("result=" + result);

	}

	@Test
	public void add() {

		AccountVo admin = new AccountVo();

		admin.setGroupId(1);
		admin.setName("hello_5");
		admin.setOpenId("WeiXin12");
		admin.setEnable(true);
		admin.setRoleId(1);
		admin.setAvatar("hello.png");
		admin.setCreatedTime(new Date());
		int rows = accountService.add(admin, "hello123");
		Assert.assertTrue(rows > 0);

	}

	@Test
	public void getList() {
		Page<AccountVo> list = accountService.getList(0, 10);
		System.out.println(list.get(0));
	}
}
