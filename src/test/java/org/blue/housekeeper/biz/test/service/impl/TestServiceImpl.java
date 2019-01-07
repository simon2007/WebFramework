package org.blue.housekeeper.biz.test.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.housekeeper.biz.test.service.TestService;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestServiceImpl implements TestService {

	@Override
	public void sayHello() {
		Logger logger=LogManager.getLogger(getClass());
		logger.info("hello");
	}

}
