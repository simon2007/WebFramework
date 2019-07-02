package org.blue.webframework.sys.region.dao;

import java.util.List;

import org.blue.webframework.sys.region.model.Region;

public interface RegionMapper {
	int dropTable();
	int truncateTable();
	int createTable();
	int insert(Region region);
	int insertSelective(Region region);
	
	Region selectByPrimaryKey(int id);
	List<Region> selectAllList(Region region);
	int deleteByPrimaryKey(int id);
	
	int updateByPrimaryKeySelective(Region region);
}
