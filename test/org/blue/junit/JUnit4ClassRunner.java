package org.blue.junit;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.ibatis.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ResourceUtils;

public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);

		try {
			File log4jConfigFile = ResourceUtils.getFile( JunitConfig.Log4j);
			PropertyConfigurator.configure(log4jConfigFile.getAbsolutePath());
			LogFactory.useLog4JLogging();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
