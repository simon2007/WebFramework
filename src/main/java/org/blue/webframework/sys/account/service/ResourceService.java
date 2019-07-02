package org.blue.webframework.sys.account.service;

import org.blue.webframework.sys.account.vo.ResourceVo;
/**
 * 资源服务
 * @author Lilongwu
 *
 */
public interface ResourceService {
	
	/**
	 * 增加资源信息
	 * @param resource 资源信息数据
	 */
	void add(ResourceVo resource);
	
	/**
	 * 根据id查询资源信息
	 * @param id 资源信息id
	 * @return  匹配的资源信息数据，如果没有匹配的数据，则返回null
	 */
	ResourceVo selectById(int id);

	/**
	 * 删除与创建表
	 */
	void recreateTable();
}
