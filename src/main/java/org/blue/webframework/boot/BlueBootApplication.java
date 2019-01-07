package org.blue.webframework.boot;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.pool.DruidDataSource;

@EnableTransactionManagement
@ComponentScan(value = "org.blue.webframework", lazyInit = true, excludeFilters = { @Filter(Controller.class),
		@Filter(RestController.class) })
public class BlueBootApplication extends SpringBootServletInitializer {
	protected final ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(getClass());
	}

	// 其中 dataSource 框架会自动为我们注入
	@Bean
	public PlatformTransactionManager txManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public ScheduledExecutorService scheduledExecutorService() {
		ScheduledExecutorService ss = Executors.newScheduledThreadPool(5);
		return ss;
	}

	@Bean
	public TaskScheduler taskScheduler() {
		return new ConcurrentTaskScheduler();
	}

	protected Properties loadProperties(String resource) throws IOException {
		InputStream inputStream = null;

		try {

			Properties properties = new Properties();
			inputStream = resolver.getResource(resource).getInputStream();
			properties.load(inputStream);
			return properties;
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (Exception e) {
			}
		}
	}

	protected List<String> getDatasourceConfigPath() {
		List<String> config = new ArrayList<String>();
		config.add("classpath:properties/druidDataSource.properties");
		config.add("classpath:properties/jdbc.properties");
		return config;
	}

	@Bean(destroyMethod = "close", initMethod = "init")
	@ConditionalOnMissingBean // 当容器里没有指定的Bean的情况下创建该对象
	public DataSource dataSource() throws IOException {

		DruidDataSource druidDataSource = new DruidDataSource();

		Properties properties = null;
		for (String path : getDatasourceConfigPath()) {
			if (properties == null)
				properties = loadProperties(path);
			else
				properties.putAll(loadProperties(path));
		}

		druidDataSource.setConnectProperties(properties);

		return druidDataSource;
	}
}
