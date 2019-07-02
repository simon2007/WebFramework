package org.blue.webframework.sys.region.service;

import java.util.List;

import org.blue.webframework.sys.region.model.Region;

public interface RegionService {
	public void recreateTable();
	void createInitData();
	public List<Region> getAll();
}
