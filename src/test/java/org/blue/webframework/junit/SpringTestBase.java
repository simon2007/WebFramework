package org.blue.webframework.junit;

import org.blue.housekeeper.boot.HouseKeeperBoot;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes= {HouseKeeperBoot.class})
@RunWith(SpringRunner.class)
@Transactional()
public class SpringTestBase {
	@Autowired
    protected ApplicationContext ctx;
}
