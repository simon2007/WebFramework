package org.blue.housekeeper.boot;

import org.blue.webframework.boot.BlueBootApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@SpringBootApplication
@ComponentScan("org.blue.housekeeper")
public class HouseKeeperBoot extends BlueBootApplication {

}
