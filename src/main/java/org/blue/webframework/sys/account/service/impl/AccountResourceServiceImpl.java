package org.blue.webframework.sys.account.service.impl;

import javax.annotation.Resource;

import org.blue.webframework.sys.account.dao.AccountResourceMapper;
import org.blue.webframework.sys.account.model.AccountResource;
import org.blue.webframework.sys.account.service.AccountResourceService;
import org.springframework.stereotype.Service;

@Service("AccountResourceService")
public class AccountResourceServiceImpl implements AccountResourceService {

	@Resource
	private AccountResourceMapper accountResourceMapper;
	
	@Override
	public void recreateTable() {
		accountResourceMapper.dropTable();
		accountResourceMapper.createTable();

	}

	@Override
	public void grant(long accountId, String operate, long resourceId) {
		if(accountResourceMapper.getCount(accountId, operate, resourceId)<=0)
		{
			AccountResource accountResource=new AccountResource();
			accountResource.setOperate(operate);
			accountResource.setResourceId(resourceId);
			accountResource.setAccountId(accountId);
			accountResourceMapper.insert(accountResource);
		}
	}

	@Override
	public void revoke(long accountId, String operate, long resourceId) {
		accountResourceMapper.delete(accountId, operate, resourceId);

	}

}
