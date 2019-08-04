package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.AccountLoginVo;
import org.blue.webframework.sys.account.vo.AccountPasswordResetVo;
import org.blue.webframework.sys.account.vo.AccountVo;

import com.github.pagehelper.Page;
/**
 * 账户管理接口
 * @author Lilongwu
 *
 */
public interface AccountService {

	/**
	 * 根据用户的id获取微信的openid
	 * @param userId
	 * @return
	 */
	String getOpenIdById(int userId);

	/**
	 * 根据用户的id获取用户信息
	 * @param userId
	 * @return
	 */
	AccountVo getAccountById(int userId);
	
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
	int delete(int userId);
	
	/**
	  * 启用或者禁用用户
	 * @param userId
	 * @param enable
	 */
	void setEnable(int userId,boolean enable);
	
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
	 * 登录
	 * @param accountLoginVo 登录
	 * @return 用户信息
	 */
	AccountVo login(AccountLoginVo accountLoginVo);
	
	/**
	 * 重置密码
	 * @return
	 */
	void resetPassword(AccountPasswordResetVo accountPasswordResetVo);
	
	/**
	 * 创建用户表
	 */
	void recreateTable();
	
	
	/**
	 * 获取token
	 * @param account
	 * @return
	 */
	String getUserToken(AccountVo account);
	
	int getAccountIdFromToken(String token);
	
	/**
	 * 获取用户名
	 * @param token
	 * @return
	 */
	String getNameFromToken(String token);
	
	int getRoleIdFromToken(String token);
	
	int getGroupIdFromToken(String token);
	/**
	 * 
	 * @param token
	 * @return
	 */
	AccountVo getAccountFromToken(String token);
}
