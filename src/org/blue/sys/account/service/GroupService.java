package org.blue.sys.account.service;

import org.blue.sys.account.vo.GroupVo;

public interface GroupService {

	GroupVo getById(long id);

	int add(GroupVo admin);

	int update(GroupVo user);

}
