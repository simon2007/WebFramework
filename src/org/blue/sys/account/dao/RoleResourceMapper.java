package org.blue.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.sys.account.model.Role;
import org.blue.sys.account.model.RoleResource;

import com.github.pagehelper.Page;
public interface RoleResourceMapper {

    Page<Role> selectAll(RoleResource role);
	Role selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(RoleResource role);
	int insertSelective(RoleResource role);
	int updateByPrimaryKeySelective(RoleResource role);
	int updateByPrimaryKey(RoleResource role);
	int hasPermission(@Param("roleId") long roleId,@Param("operate")String operate,long resourceId);
}
