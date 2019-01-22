package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.ResourceVo;

public interface ResourceService {
	void add(ResourceVo resource);
	ResourceVo selectById(Long id);
	void recreateTable();
}
