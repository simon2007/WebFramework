package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Account;

import com.github.pagehelper.Page;
/**
 * 处理用户数据的持久层
 */
public interface AccountMapper {

    Page<Account> selectAll(Account account);

	Account selectByPrimaryKey(long userId);

	int deleteByPrimaryKey(long userId);

	/**
	 * 插入用户数据
	 * @param account 用户数据
	 * @return 受影响的行数
	 */
	int insert(Account account);

	int insertSelective(Account account);

	int updateByPrimaryKeySelective(Account account);

	int updateByPrimaryKey(Account account);

	int setEnable(@Param("userId") long userId,@Param("enable")boolean enable);
	
	String getOpenIdById(long userId);

	/**
	 * 根据用户名和密码查询用户数据
	 * @param name 用户名
	 * @param password 密码
	 * @return 匹配的用户数据，如果没有匹配的数据，则返回null
	 */
	Account getByNameAndPassword(@Param("name")String name,@Param("password") String password);

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
