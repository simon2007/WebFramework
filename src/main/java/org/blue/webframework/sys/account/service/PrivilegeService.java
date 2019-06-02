package org.blue.webframework.sys.account.service;
/**
 * 权限
 * @author long
 *
 */
public interface PrivilegeService {

	/**
	 * 给账号授权
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceId 资源id
	 */
	void grantAccount(long accountId,String operate,long resourceId);
	
	/**
	    * 给账号授权
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 */
	void grantAccount(long accountId,String operate,String resourceCode);
	
	/**
	 * 给角色授权 
	 * @param roleId
	 * @param operate
	 * @param resourceId
	 */
	void grantRole(long roleId,String operate,long resourceId);
	
	/**
	 * 给角色授权 
	 * @param roleId
	 * @param operate
	 * @param resourceCode
	 */
	void grantRole(long roleId,String operate,String resourceCode);

	/**
	 * 判断账户是否有权限
	 * @param accountId
	 * @param operate
	 * @param resourceCode
	 * @return
	 */
	boolean hasAccountPermission(long accountId, String operate, String resourceCode);
	
	/**
	 * 判断账户是否有权限
	 * @param accountId
	 * @param operate
	 * @param resourceName
	 * @return
	 */
	boolean hasAccountPermissionWithName(long accountId, String operate, String resourceName);
	
	/**
	 * 判断角色是否有权限
	 * @param roleId
	 * @param operate
	 * @param resourceCode
	 * @return
	 */
	boolean hasRolePermission(long roleId,String operate,String resourceCode);
	
	/**
	 * 判断角色是否有权限
	 * @param roleId
	 * @param operate
	 * @param resourceName
	 * @return
	 */
	boolean hasRolePermissionWithName(long roleId,String operate,String resourceName);
	
	void recreateTable();
	void revokeAccount(long accountId,String operate,long resourceId);
	void revokeRole(long roleId,String operate,long resourceId);
}
