package org.blue.junit.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.blue.junit.SpringTestRollBackBase;
import org.blue.sys.account.service.GroupService;
import org.blue.sys.account.vo.GroupVo;
import org.junit.Before;
import org.junit.Test;



public class GroupServiceTest extends SpringTestRollBackBase {

	@Resource
	private GroupService groupService;
	
	GroupVo admin;

	@Before
	public void init() {
		admin = new GroupVo();

		admin.setId(1);
		admin.setName("admin");
		admin.setEnable(true);

		groupService.add(admin);

	}

	@Test
	public void userGetByIdTest() {
		GroupVo dbUserVo = groupService.getById(admin.getId());
		assertNotNull(dbUserVo);
		assertEquals(dbUserVo.getName(), admin.getName());
		assertEquals(dbUserVo.getEnable(), admin.getEnable());

	}

	@Test
	public void userInsertTest() {

		GroupVo user = new GroupVo();

		user.setName("name");
		user.setEnable(true);
	
		groupService.add(user);

		user.setName("user1");

		
		groupService.update(user);

		GroupVo dbUserVo = groupService.getById(user.getId());
		assertEquals(dbUserVo.getName(), user.getName());
		assertEquals(dbUserVo.getEnable(), user.getEnable());

	}

}
