package org.blue.webframework.sys.account.service;
/**
 * 权限
 * @author Lilongwu
 *
 */
public interface PrivilegeService {

	/**
	 * 给账号授权
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceId 资源id
	 */
	void grantAccount(int accountId,String operate,int resourceId);
	
	/**
	    * 给账号授权
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 */
	void grantAccount(int accountId,String operate,String resourceCode);
	
	/**
	 * 给角色授权 
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceId 资源id
	 */
	void grantRole(int roleId,String operate,int resourceId);
	
	/**
	 * 给角色授权 
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 */
	void grantRole(int roleId,String operate,String resourceCode);

	/**
	 * 判断账户是否有权限
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 * @return
	 */
	boolean hasAccountPermission(int accountId, String operate, String resourceCode);
	
	/**
	 * 判断账户是否有权限
	 * @param accountId 账户id
	 * @param operate 操作
	 * @param resourceName 资源名
	 * @return
	 */
	boolean hasAccountPermissionWithName(int accountId, String operate, String resourceName);
	
	/**
	 * 判断角色是否有权限
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceCode 资源编码
	 * @return
	 */
	boolean hasRolePermission(int roleId,String operate,String resourceCode);
	
	/**
	 * 判断角色是否有权限
	 * @param roleId 角色id
	 * @param operate 操作
	 * @param resourceName 资源名
	 * @return
	 */
	boolean hasRolePermissionWithName(int roleId,String operate,String resourceName);
	
	void recreateTable();
	void revokeAccount(int accountId,String operate,int resourceId);
	void revokeRole(int roleId,String operate,int resourceId);
}
