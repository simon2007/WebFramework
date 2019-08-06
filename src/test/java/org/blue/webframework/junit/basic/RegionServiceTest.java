package org.blue.webframework.junit.basic;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestBase;
import org.blue.webframework.sys.pinyin.service.PinyinService;
import org.blue.webframework.sys.region.model.Region;
import org.blue.webframework.sys.region.service.RegionService;
import org.junit.Assert;
import org.junit.Test;

public class RegionServiceTest extends SpringTestBase {

	@Resource
	RegionService regionService;
	
	@Resource
	PinyinService pinyinService;

	@Test
	public void regionTest() {
		List<Region> list= regionService.getRegionList(1);
		System.out.println("list="+list.size());
		Assert.assertFalse(list.isEmpty());
		
	}
	
	@Test
	public void pinyinTest()
	{
		String text=pinyinService.getPinyin("哈哈");
		assertEquals("haha", text);
	}
}
