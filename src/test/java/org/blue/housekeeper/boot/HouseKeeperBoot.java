package org.blue.housekeeper.boot;

import java.io.IOException;
import java.util.List;

import org.blue.webframework.boot.BlueBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;

@SpringBootConfiguration
@SpringBootApplication
@ComponentScan("org.blue.housekeeper")
@MapperScan(basePackages="org.blue.housekeeper.biz.*.dao")
public class HouseKeeperBoot extends BlueBootApplication {
	@Override
	protected List<Resource> getMyBatisMapperLocations(String locationPattern) throws IOException {

		return super.getMyBatisMapperLocations(locationPattern + ",classpath:org/blue/housekeeper/**/mapper/*.xml");
	}

	public static void main(String[] args)
	{
		SpringApplication.run(HouseKeeperBoot.class, args);
	}
}
