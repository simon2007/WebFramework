package org.blue.webframework.sys.region.service;

import java.util.List;

import org.blue.webframework.sys.region.model.Region;

/**
 * 获取地址
 * @author long
 *
 */
public interface RegionService {
	public void recreateTable();
	void createInitData();
	List<Region> getAll();
	
	List<Region> getRegionList(int rootId);
}
