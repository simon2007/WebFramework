package org.blue.housekeeper.boot;

import java.io.IOException;
import java.util.List;

import org.blue.webframework.boot.MyBatisBootConfig;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration

public class MyBatisConfig extends MyBatisBootConfig{

	@Override
	protected List<Resource> getMapperLocations(String locationPattern) throws IOException {

		return super.getMapperLocations(locationPattern + ",classpath:org/blue/housekeeper/**/mapper/*.xml");
	}
	
	@Override
	protected String getMapperBasePackage() {
System.out.println("getMapperBasePackage");
		return super.getMapperBasePackage() + ",org.blue.housekeeper.biz.*.dao";
	}
	
}
