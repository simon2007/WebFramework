package org.blue.webframework.sys.account.service;

public interface AccountResourceService {

	void recreateTable();
	
	void grant(long accountId,String operate,long resourceId);
	void revoke(long accountId,String operate,long resourceId);
}
