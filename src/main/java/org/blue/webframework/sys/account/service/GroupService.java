package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.GroupVo;
/**
   * 用户组
 * @author Lilongwu
 *
 */
public interface GroupService {

	/**
	 * 根据id查询用户组的数据
	 * @param id id
	 * @return 该用户组的数据
	 */
	GroupVo getById(int id);

	/**
	 * 添加用户组数据
	 * @param admin 组数据
	 * @return 受影响的行数
	 */
	int add(GroupVo admin);

	/**
	 * 更新用户组数据
	 * @param user 组数据
	 * @return 受影响的行数
	 */
	int update(GroupVo user);

	/**
	 * 创建与删除表
	 */
	void recreateTable();
}
