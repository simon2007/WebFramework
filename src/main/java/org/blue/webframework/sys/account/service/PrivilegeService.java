package org.blue.webframework.sys.account.service;

public interface PrivilegeService {

	boolean hasRolePermission(long roleId,String operate,String resourceCode);
	boolean hasRolePermissionWithName(long roleId,String operate,String resourceName);
	
	boolean hasAccountPermission(long accountId, String operate, String resourceCode);
	boolean hasAccountPermissionWithName(long accountId, String operate, String resourceName);
}
