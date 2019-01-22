package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.RoleResource;
public interface RoleResourceMapper {

	RoleResource selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(RoleResource role);
	
	int updateByPrimaryKeySelective(RoleResource roleResource);

	int getCount(@Param("roleId") long roleId,@Param("operate")String operate,@Param("resourceId")long resourceId);
	int getCountWidthCode(@Param("roleId") long roleId,@Param("operate")String operate,@Param("resourceCode")String resourceCode);
	
	
	int delete(@Param("roleId") long roleId,@Param("operate")String operate,@Param("resourceId")long resourceId);
	
	int dropTable();
	int truncateTable();
	int createTable();
}
