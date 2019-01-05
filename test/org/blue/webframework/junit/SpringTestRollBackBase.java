package org.blue.webframework.junit;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {JunitConfig.ContextConfiguration})
@Transactional("txManager")
@Rollback(true)
public class SpringTestRollBackBase{
	
	@Autowired
    protected ApplicationContext ctx;
}