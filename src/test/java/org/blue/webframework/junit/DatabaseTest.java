package org.blue.webframework.junit;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.service.GroupService;
import org.blue.webframework.sys.account.service.ResourceService;
import org.blue.webframework.sys.account.service.RoleService;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.blue.webframework.sys.account.vo.GroupVo;
import org.blue.webframework.sys.account.vo.RoleVo;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.junit.Test;

import com.alibaba.druid.filter.config.ConfigTools;


public class DatabaseTest extends SpringTestBase {

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
	
	@Resource
	private SiteParameterService siteParameterService;
	
	@Resource
	private RoleService roleService;
	
	@Resource
	private ResourceService resourceService;
	//@Test
	public void setup()
	{
		siteParameterService.recreateTable();
		accountService.recreateTable();
		groupService.recreateTable();
		roleService.recreateTable();
		resourceService.recreateTable();
		
		siteParameterService.putParamValue("smtp", "smtp.qq.com");
		
		
		RoleVo adminRole=new RoleVo();
		adminRole.setEnable(true);
		adminRole.setName("admins");
		roleService.add(adminRole);
		
		
		GroupVo adminGroup=new GroupVo();
		adminGroup.setEnable(true);
		adminGroup.setName("admins");
		groupService.add(adminGroup);
		
		AccountVo account=new AccountVo();
		account.setEnable(true);
		account.setName("admin");
		account.setRoleId(adminRole.getId());
		account.setGroupId(adminGroup.getId());
		accountService.add(account, "admin");
		
	}
}
