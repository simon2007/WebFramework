package org.blue.webframework.boot;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.blue.webframework.exception.BaseException;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;



@ImportAutoConfiguration(PageHelperAutoConfiguration.class)
@EnableAsync
@EnableScheduling
@EnableTransactionManagement
@ComponentScan(value = "org.blue.webframework", lazyInit = true, excludeFilters = { @Filter(Controller.class),
		@Filter(RestController.class) })
@MapperScan(basePackages = {"org.blue.webframework.sys.*.dao","org.blue.webframework.biz.*.dao"})
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

	private final String mapperLocations = "classpath*:org/blue/webframework/**/mapper/*.xml";

	@Bean
	@ConditionalOnMissingBean // 当容器里没有指定的Bean的情况下创建该对象
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// 设置数据源
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 设置mybatis的主配置文件

		sqlSessionFactoryBean.setMapperLocations(getMyBatisMapperLocations(mapperLocations).toArray(new Resource[0]));

		sqlSessionFactoryBean.setConfigurationProperties(createMyBatisConfigProperties());
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
		return sqlSessionFactoryBean;
	}

	protected Properties createMyBatisConfigProperties() {
		Properties properties = new Properties();
		properties.setProperty("logImpl", "LOG4J");
		//开启延迟加载 ，默认值为true
		properties.setProperty("lazyLoadingEnabled", "true");
		//二级缓存的总开关
		properties.setProperty("cacheEnabled", "true");
		// 驼峰转换
		properties.setProperty("mapUnderscoreToCamelCase", "true");
		return properties;
	}



	protected List<Resource> getMyBatisMapperLocations(String locationPattern) throws IOException {
		List<Resource> ret = new ArrayList<Resource>();
		for (String path : locationPattern.split(","))
			ret.addAll(Arrays.asList(resolver.getResources(path)));
		return ret;
	}

	
    @Bean
    public ResourceBundleMessageSource messageSource() {
		return BaseException.messageSource();

    }
}
