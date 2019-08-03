package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Account;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;
/**
 * 处理用户数据的持久层
 */
@Repository
public interface AccountMapper{

	/**
	 * 根据条件查询所有匹配的账户数据
	 * @param account 账户数据
	 * @return
	 */
    Page<Account> selectAll(Account account);

	/**
	 * 根据id查询账户数据
	 * @param accountId 用户id
	 * @return 匹配的用户数据，如果没有匹配的数据，则返回null
	 */
	Account selectByPrimaryKey(int accountId);

	/**
	 * 根据用户id删除账户数据
	 * @param accountId 用户id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int accountId);

	/**
	 * 插入用户数据
	 * @param account 账户数据
	 * @return 受影响的行数
	 */
	int insert(Account account);

	/**
	 * 插入用户数据
	 * @param account 账户数据
	 * @return 受影响的行数
	 */
	int insertSelective(Account account);

	/**
	 * 根据id更新账户数据
	 * @param account 账户数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Account account);

	/**
	 * 根据id更新账户数据
	 * @param account 账户数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(Account account);

	/**
	 * 根据id设置是否启用该账户
	 * @param userId 用户id
 	 * @param enable 是否启用
	 * @return 受影响的行数
	 */
	int setEnable(@Param("userId") int userId,@Param("enable")boolean enable);

	/**
	 * 根据id查询微信的openid
	 * @param userId 用户id
	 * @return 匹配的微信的openid
	 */
	String getOpenIdById(int userId);

	/**
	 * 根据用户名查询用户数据
	 * @param name 用户名
	 * @return 匹配的用户数据，如果没有匹配的数据，则返回null
	 */
	Account getByName(@Param("name")String name);

	/**
	 * 如果存在account表，
	 * 先drop掉，然后create表，
	 * 然后再进行数据插入。
	 * @return 受影响的行数
	 */
	int dropTable();

	/**
	 * 清空表
	 * @return 受影响的行数
	 */
	int truncateTable();

	/**
	 * 创建用户表
	 * @return 受影响的行数
	 */
	int createTable();
}
