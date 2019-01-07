package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Group;

import com.github.pagehelper.Page;
public interface GroupMapper {

    Page<Group> selectAll(Group account);
	Group selectByPrimaryKey(long id);
	int deleteByPrimaryKey(long id);
	int insert(Group group);
	int insertSelective(Group group);
	int updateByPrimaryKeySelective(Group group);
	int updateByPrimaryKey(Group group);
	int setEnable(@Param("id") long id,@Param("enable")boolean enable);
	
	int dropTable();
	int truncateTable();
	int createTable();
}
