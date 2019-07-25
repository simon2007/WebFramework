package org.blue.webframework.junit.region;

import java.util.List;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestBase;
import org.blue.webframework.sys.region.model.Region;
import org.blue.webframework.sys.region.service.RegionService;
import org.junit.Assert;
import org.junit.Test;

public class RegionServiceTest extends SpringTestBase {

	@Resource
	RegionService regionService;

	@Test
	public void getList() {
		List<Region> list = regionService.getAll();
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);

	}
	
	@Test
	public void getParentList()
	{
		//List<Region> list = regionService.getRegionList(1);
		//Assert.assertNotNull(list);
		//Assert.assertTrue(list.size() > 0);
	}
}
