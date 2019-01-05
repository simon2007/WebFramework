package org.blue.webframework.sys.account.service;

public interface PrivilegeService {

	boolean hasRolePermission(long roleId,String operate,String resourceCode);

	boolean hasUserPermission(long userId, String operate, String resourceCode);
}
