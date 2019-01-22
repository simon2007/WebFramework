package org.blue.webframework.sys.account.service;

public interface RoleResourceService {

	void recreateTable();
	
	void grant(long roleId,String operate,long resourceId);
	void revoke(long roleId,String operate,long resourceId);
}
