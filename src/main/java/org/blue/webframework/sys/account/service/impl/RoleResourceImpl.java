package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.dao.RoleResourceMapper;
import org.blue.webframework.sys.account.model.RoleResource;
import org.blue.webframework.sys.account.service.RoleResourceService;
import org.springframework.stereotype.Service;

@Service("RoleResourceService")
public class RoleResourceImpl implements RoleResourceService {

	@Resource
	private RoleResourceMapper roleResourceMapper;
	
	@Override
	public void recreateTable() {
		roleResourceMapper.dropTable();
		roleResourceMapper.createTable();

	}

	@Override
	public void grant(long roleId, String operate, long resourceId) {
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
	public void revoke(long roleId, String operate, long resourceId) {
		roleResourceMapper.delete(roleId, operate, resourceId);
	}

}
