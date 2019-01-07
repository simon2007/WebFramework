package org.blue.webframework.junit;

import javax.annotation.Resource;

import org.blue.housekeeper.biz.test.service.TestService;
import org.junit.Test;

public class TestServiceTest extends SpringTestRollBackBase{

	@Resource
	private TestService testService;
	
	@Test
	public void test()
	{
		testService.sayHello();
	}
}
