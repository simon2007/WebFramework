package org.blue.housekeeper.boot;

import java.io.IOException;
import java.util.List;

import org.blue.webframework.boot.BlueBootApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;

@SpringBootConfiguration
@SpringBootApplication
@ComponentScan("org.blue.housekeeper")
public class HouseKeeperBoot extends BlueBootApplication {
	@Override
	protected List<Resource> getMyBatisMapperLocations(String locationPattern) throws IOException {

		return super.getMyBatisMapperLocations(locationPattern + ",classpath:org/blue/housekeeper/**/mapper/*.xml");
	}

	@Override
	protected String getMyBatisMapperBasePackage() {
		return super.getMyBatisMapperBasePackage() + ",org.blue.housekeeper.biz.*.dao";
	}

}
