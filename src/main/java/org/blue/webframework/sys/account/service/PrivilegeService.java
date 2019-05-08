package org.blue.webframework.sys.account.service;

public interface PrivilegeService {

	void grantAccount(long accountId,String operate,long resourceId);
	void grantAccount(long accountId,String operate,String resourceCode);
	
	void grantRole(long roleId,String operate,long resourceId);
	void grantRole(long roleId,String operate,String resourceCode);

	boolean hasAccountPermission(long accountId, String operate, String resourceCode);
	boolean hasAccountPermissionWithName(long accountId, String operate, String resourceName);
	boolean hasRolePermission(long roleId,String operate,String resourceCode);
	boolean hasRolePermissionWithName(long roleId,String operate,String resourceName);
	
	void recreateTable();
	void revokeAccount(long accountId,String operate,long resourceId);
	void revokeRole(long roleId,String operate,long resourceId);
}
