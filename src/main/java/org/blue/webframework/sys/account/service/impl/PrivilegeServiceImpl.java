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
	public void grantAccount(long accountId, String operate, long resourceId) {
		if(accountResourceMapper.getCount(accountId, operate, resourceId)<=0)
		{
			AccountResource accountResource=new AccountResource();
			accountResource.setOperate(operate);
			accountResource.setResourceId(resourceId);
			accountResource.setAccountId(accountId);
			accountResourceMapper.insert(accountResource);
		}
	}

	@Override
	public void grantAccount(long accountId, String operate, String resourceCode) {
		Resource resource=resourceMapper.selectByCode(resourceCode);
		grantAccount(accountId,operate,resource.getId());
	}

	@Override
	public void grantRole(long roleId, String operate, long resourceId) {
		if(roleResourceMapper.getCount(roleId, operate, resourceId)<=0)
		{
			RoleResource roleResource=new RoleResource();
			roleResource.setOperate(operate);
			roleResource.setResourceId(resourceId);
			roleResource.setRoleId(roleId);
			roleResourceMapper.insert(roleResource);
		}
			
		
	}

	@Override
	public void grantRole(long roleId, String operate, String resourceCode) {
		Resource resource=resourceMapper.selectByCode(resourceCode);
		grantRole(roleId,operate,resource.getId());
		
	}

	
	
	@Override
	public boolean hasAccountPermission(long accountId, String operate, String resourceCode) {
		return roleResourceMapper.getCountWidthCode(accountId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasAccountPermissionWithName(long accountId, String operate, String resourceName) {
		return accountResourceMapper.getCountWidthName(accountId, operate, resourceName)>0;
	}

	@Override
	public boolean hasRolePermission(long roleId, String operate, String resourceCode) {

		return accountResourceMapper.getCountWidthCode(roleId, operate, resourceCode)>0;
	}

	@Override
	public boolean hasRolePermissionWithName(long roleId, String operate, String resourceName) {
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
	public void revokeAccount(long accountId, String operate, long resourceId) {
		accountResourceMapper.delete(accountId, operate, resourceId);

	}

	@Override
	public void revokeRole(long roleId, String operate, long resourceId) {
		roleResourceMapper.delete(roleId, operate, resourceId);
	}
}
