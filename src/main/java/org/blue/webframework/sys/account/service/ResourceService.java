package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.ResourceVo;
/**
 * 资源服务
 * @author long
 *
 */
public interface ResourceService {

	void add(ResourceVo resource);

	ResourceVo selectById(Long id);

	void recreateTable();
}
