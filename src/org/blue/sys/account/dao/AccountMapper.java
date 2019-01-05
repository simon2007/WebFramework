package org.blue.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.sys.account.model.Account;

import com.github.pagehelper.Page;
public interface AccountMapper {


    Page<Account> selectAll(Account account);
	Account selectByPrimaryKey(long userId);
	int deleteByPrimaryKey(long userId);
	int insert(Account account);
	int insertSelective(Account account);
	int updateByPrimaryKeySelective(Account account);
	int updateByPrimaryKey(Account account);
	int setEnable(@Param("userId") long userId,@Param("enable")boolean enable);
	
	String getOpenIdById(long userId);
	Account getByNameAndPassword(@Param("name")String name,@Param("password") String password);
	
	int dropTable();
	int truncateTable();
	int createTable();
}
