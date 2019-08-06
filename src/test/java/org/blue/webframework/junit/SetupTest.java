package org.blue.webframework.junit;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.account.service.GroupService;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.blue.webframework.sys.account.service.ResourceService;
import org.blue.webframework.sys.account.service.RoleService;
import org.blue.webframework.sys.account.vo.AccountVo;
import org.blue.webframework.sys.account.vo.GroupVo;
import org.blue.webframework.sys.account.vo.ResourceVo;
import org.blue.webframework.sys.account.vo.RoleVo;
import org.blue.webframework.sys.attach.service.AttachService;
import org.blue.webframework.sys.log.service.LogService;
import org.blue.webframework.sys.region.service.RegionService;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

@Rollback(false)
public class SetupTest extends SpringTestBase{
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
	
	@Resource
	private PrivilegeService privilegeService;
	
	@Resource
	private LogService logService;
	
	@Resource
	private RegionService regionService;

	@Resource
	private AttachService attachService;


	public void createTable() {
		siteParameterService.recreateTable();
		accountService.recreateTable();
		groupService.recreateTable();
		roleService.recreateTable();
		resourceService.recreateTable();
		privilegeService.recreateTable();
		attachService.recreateTable();
		logService.recreateTable();
		regionService.recreateTable();
	}
	

	private void createDefaultParameter()
	{
		siteParameterService.putParamValue("smtp", "smtp.qq.com","邮件发送服务器");
		siteParameterService.putParamValue("smtpuser", "123456@tom.com","邮件发送登录名");
		siteParameterService.putParamValue("smtppwd", "123456","邮件发送密码");
		
		siteParameterService.putParamValue("indentifying_code_send_number","15","今天发送数量已经达到上限");
		siteParameterService.putParamValue("indentifying_code_alive_time","90","验证码有效时间");
		siteParameterService.putParamValue("indentifying_code_length","4","验证码长度");
	}
	
	
	private void createResource(String code,String name,String comment,String operates)
	{
		ResourceVo resourceVo=new ResourceVo();
		resourceVo.setCode(code);
		resourceVo.setName(name);
		resourceVo.setComment(comment);
		resourceVo.setOperates(operates);
		resourceService.add(resourceVo);		
	}
	
	private void createResources()
	{
		createResource("backMainPage","/admin/index","后台管理框架页","read");
		createResource("backConsole","/admin/console","后台管理首页","read");
		
		createResource("backUserList","/admin/users/list","后台用户列表","read");
		createResource("backUserAdd","/admin/users/add","后台用户新增","read,create");
		createResource("backUserModify","/admin/users/modify","后台用户修改","read,modify");
		createResource("backUserDelete","/admin/users/delete","后台用户删除","delete");
		createResource("backUserListData","/admin/users/getList","后台用户列表数据","read");
	}
	
	private void createAdmin()
	{
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
		
		
		privilegeService.grantRole(adminRole.getId(), "read", "backMainPage");
		privilegeService.grantRole(adminRole.getId(), "read", "backConsole");
		
		privilegeService.grantRole(adminRole.getId(), "read", "backUserList");
		privilegeService.grantRole(adminRole.getId(), "read", "backUserAdd");
		privilegeService.grantRole(adminRole.getId(), "create", "backUserAdd");
		privilegeService.grantRole(adminRole.getId(), "read", "backUserModify");
		privilegeService.grantRole(adminRole.getId(), "modify", "backUserModify");
		privilegeService.grantRole(adminRole.getId(), "delete", "backUserDelete");
		privilegeService.grantRole(adminRole.getId(), "read", "backUserListData");
		
	}

	@Test
	public void createDefaultData() {
		createTable();
		createDefaultParameter();
		createResources();
		createAdmin();
		regionService.createInitData();

		
	}
}
