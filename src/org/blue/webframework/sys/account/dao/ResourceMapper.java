package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Role;

import com.github.pagehelper.Page;
public interface ResourceMapper {

    Page<Role> selectAll(Role role);
	Role selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(Role role);
	int insertSelective(Role role);
	int updateByPrimaryKeySelective(Role role);
	int updateByPrimaryKey(Role role);
	int setEnable(@Param("id") long id,@Param("enable")boolean enable);
}
