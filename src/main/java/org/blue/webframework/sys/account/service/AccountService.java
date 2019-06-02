package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.AccountVo;

import com.github.pagehelper.Page;
/**
 * 账户管理接口
 * @author long
 *
 */
public interface AccountService {

	/**
	 * 根据用户的id获取微信的openid
	 * @param userId
	 * @return
	 */
	String getOpenIdById(long userId);

	/**
	 * 根据用户的id获取用户信息
	 * @param userId
	 * @return
	 */
	AccountVo getUserById(long userId);
	
	/**
	 * 新增用户
	 * @param account
	 * @param password
	 * @return
	 */
	int add(AccountVo account,String password);
	
	/**
	  * 更新用户
	 * @param account
	 * @return
	 */
	int update(AccountVo account);
	
	/**
	  * 删除用户
	 * @param userId
	 * @return
	 */
	int delete(long userId);
	
	/**
	  * 启用或者禁用用户
	 * @param userId
	 * @param enable
	 */
	void setEnable(long userId,boolean enable);
	
	/**
	 * 获取用户列表，分页显示
	 * @param pageIndex 页数，从1开始
	 * @param pageSize 每一页的大小
	 * @return
	 */
	Page<AccountVo> getList(int pageIndex,int pageSize);
	
	/**
	  * 获取用户列表，分页显示
	 * @param account 查询条件
	 * @param pageIndex 页数，从1开始
	 * @param pageSize 每一页的大小
	 * @return
	 */
	Page<AccountVo> getList(AccountVo account,int pageIndex,int pageSize);

	/**
	 * 根据用户名和密码获取用户信息
	 * @param name
	 * @param password
	 * @return
	 */
	AccountVo getByNameAndPassword(String name, String password);
	
	/**
	 * 重置密码
	 * @param name
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	int resetPassword(String name, String oldPassword,String newPassword);
	
	/**
	 * 创建用户表
	 */
	void recreateTable();
}
