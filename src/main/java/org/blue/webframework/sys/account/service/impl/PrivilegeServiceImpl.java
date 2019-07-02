package org.blue.webframework.sys.account.service.impl;


import org.blue.webframework.sys.account.dao.AccountResourceMapper;
import org.blue.webframework.sys.account.dao.ResourceMapper;
import org.blue.webframework.sys.account.dao.RoleResourceMapper;
import org.blue.webframework.sys.account.model.AccountResource;
import org.blue.webframework.sys.account.model.Resource;
import org.blue.webframework.sys.account.model.RoleResource;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PrivilegeService")
class PrivilegeServiceImpl implements PrivilegeService {
	@Autowired
	private AccountResourceMapper accountResourceMapper;
	
	@Autowired
	private ResourceMapper resourceMapper;
	
	@Autowired
	private RoleResourceMapper roleResourceMapper;
	
	@Override
	public void grantAccount(int accountId, String operate, int resourceId) {
		//判断该账号是否有权限
		if(accountResourceMapper.getCount(accountId, operate, resourceId)<=0)
		{
			//否
			//给账号授权
			AccountResource accountResource=new AccountResource();
			accountResource.setOperate(operate);
			accountResource.setResourceId(resourceId);
			accountResource.setAccountId(accountId);
			accountResourceMapper.insert(accountResource);
		}
	}

	@Override
	public void grantAccount(int accountId, String operate, String resourceCode) {
		Resource resource=resourceMapper.selectByCode(resourceCode);
		grantAccount(accountId,operate,resource.getId());
	}

	@Override
	public void grantRole(int roleId, String operate, int resourceId) {
		//判断角色信息是否存在
		if(roleResourceMapper.getCount(roleId, operate, resourceId)<=0)
		{
			//不存在，执行添加
			RoleResource roleResource=new RoleResource();
			roleResource.setOperate(operate);
			roleResource.setResourceId(resourceId);
			roleResource.setRoleId(roleId);
			roleResourceMapper.insert(roleResource);
		}
			
	}

	@Override
	public void grantRole(int roleId, String operate, String resourceCode) {
		//根据资源编码查询资源信息
		Resource resource=resourceMapper.selectByCode(resourceCode);
		//资源信息已存在，则不添加。
		//不存在，则执行添加资源信息
		grantRole(roleId,operate,resource.getId());
		
	}

	
	
	@Override
	public boolean hasAccountPermission(int accountId, String operate, String resourceCode) {
		return roleResourceMapper.getCountWidthCode(accountId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasAccountPermissionWithName(int accountId, String operate, String resourceName) {
		return accountResourceMapper.getCountWidthName(accountId, operate, resourceName)>0;
	}

	@Override
	public boolean hasRolePermission(int roleId, String operate, String resourceCode) {

		return accountResourceMapper.getCountWidthCode(roleId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasRolePermissionWithName(int roleId, String operate, String resourceName) {
		return roleResourceMapper.getCountWidthName(roleId, operate, resourceName)>0;
	}
	
	
	@Override
	public void recreateTable() {
		accountResourceMapper.dropTable();
		accountResourceMapper.createTable();
		roleResourceMapper.dropTable();
		roleResourceMapper.createTable();
	}

	@Override
	public void revokeAccount(int accountId, String operate, int resourceId) {
		accountResourceMapper.delete(accountId, operate, resourceId);

	}

	@Override
	public void revokeRole(int roleId, String operate, int resourceId) {
		roleResourceMapper.delete(roleId, operate, resourceId);
	}
}
