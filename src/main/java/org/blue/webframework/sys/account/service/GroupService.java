package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.GroupVo;
/**
   * 用户组
 * @author long
 *
 */
public interface GroupService {

	GroupVo getById(long id);

	int add(GroupVo admin);

	int update(GroupVo user);

	void recreateTable();
}
