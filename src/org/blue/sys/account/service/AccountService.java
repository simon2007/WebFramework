package org.blue.sys.account.service;

import org.blue.sys.account.vo.AccountVo;

import com.github.pagehelper.Page;

public interface AccountService {

	String getOpenIdById(long userId);

	AccountVo getUserById(long userId);
	
	int add(AccountVo account,String password);
	
	int update(AccountVo account);
	
	int delete(long userId);
	
	void setEnable(long userId,boolean enable);
	
	Page<AccountVo> getList(int pageIndex,int pageSize);
	
	Page<AccountVo> getList(AccountVo account,int pageIndex,int pageSize);

	AccountVo getByNameAndPassword(String name, String password);
	
	int resetPassword(String name, String oldPassword,String newPassword);
}
