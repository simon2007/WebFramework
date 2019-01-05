package org.blue.webframework.junit;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.service.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.druid.filter.config.ConfigTools;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {JunitConfig.ContextConfiguration})
public class DatabaseTest {

	@Test
	public void printPassword() throws Exception
	{
		String encodingPassword=ConfigTools.encrypt("root");
		System.out.println("encodingPassword="+encodingPassword);
		System.out.println("encodingPassword="+ConfigTools.decrypt( encodingPassword));
	}
	
	@Resource
	private AccountService accountService;
	
	@Resource
	private GroupService groupService;
	
	@Test
	public void setup()
	{
		accountService.recreateTable();
		groupService.recreateTable();
	}
}
