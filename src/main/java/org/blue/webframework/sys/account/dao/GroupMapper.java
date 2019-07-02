package org.blue.webframework.sys.account.dao;

import org.apache.ibatis.annotations.Param;
import org.blue.webframework.sys.account.model.Group;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;

/**
 * 用户组管理的持久层
 */
@Repository
public interface GroupMapper {

	/**
	 * 根据条件查询所有匹配的账户数据
	 * @param account 账户数据
	 * @return
	 */
    Page<Group> selectAll(Group account);

	/**
	 * 根据id查询该组数据
	 * @param id id
	 * @return 匹配的数据，如果没有匹配的数据，则返回null
	 */
	Group selectByPrimaryKey(int id);

	/**
	 * 根据id删除数据
	 * @param id id
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(int id);

	/**
	 * 插入组数据
	 * @param group 组数据
	 * @return 受影响的行数
	 */
	int insert(Group group);

	/**
	 * 插入组数据
	 * @param group 组数据
	 * @return 受影响的行数
	 */
	int insertSelective(Group group);

	/**
	 * 根据id更新组数据
	 * @param group 组数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Group group);

	/**
	 * 根据id更新组数据
	 * @param group 组数据
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(Group group);

	/**
	 * 根据id查询是否启用该用户
	 * @param id id
	 * @param enable 是否启用
	 * @return 受影响的行数
	 */
	int setEnable(@Param("id") int id,@Param("enable")boolean enable);

	/**
	 * 删除group表
	 * @return 受影响的行数
	 */
	int dropTable();

	/**
	 * 清空group表
	 * @return 受影响的行数
	 */
	int truncateTable();

	/**
	 * 创建group表
	 * @return 受影响的行数
	 */
	int createTable();
}
