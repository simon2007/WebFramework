package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.AccountResource;
public interface AccountResourceMapper {

	AccountResource selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(AccountResource accountResource);
	
	int updateByPrimaryKeySelective(AccountResource roleResource);

	int getCount(@Param("accountId") long accountId,@Param("operate")String operate,@Param("resourceId")long resourceId);
	
	int getCountWidthCode(@Param("accountId") long accountId,@Param("operate")String operate,@Param("resourceCode")String resourceCode);
	int getCountWidthName(@Param("accountId")long accountId,@Param("operate") String operate,@Param("resourceName") String resourceName);
	
	int delete(@Param("accountId") long accountId,@Param("operate")String operate,@Param("resourceId")long resourceId);
	
	int dropTable();
	int truncateTable();
	int createTable();

}
