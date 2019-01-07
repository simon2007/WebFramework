package org.blue.webframework.boot;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.github.pagehelper.PageHelper;

public class MyBatisBootConfig {
	ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	private final String mapperLocations = "classpath*:org/blue/webframework/**/mapper/*.xml";

	@Bean
	@ConditionalOnMissingBean // 当容器里没有指定的Bean的情况下创建该对象
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// 设置数据源
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 设置mybatis的主配置文件

		sqlSessionFactoryBean.setMapperLocations(getMapperLocations(mapperLocations).toArray(new Resource[0]));

		sqlSessionFactoryBean.setPlugins(new Interceptor[] { createPageHelper() });
		sqlSessionFactoryBean.setConfigurationProperties(createConfigProperties());

		return sqlSessionFactoryBean;
	}

	private Properties loadProperties(String resource) throws IOException {
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

	protected Properties createConfigProperties() {
		Properties properties = new Properties();
		properties.setProperty("logImpl", "LOG4J");
		// 驼峰转换
		properties.setProperty("mapUnderscoreToCamelCase", "true");
		return properties;
	}

	protected PageHelper createPageHelper() throws IOException {
		PageHelper pageHelper = new PageHelper();
		pageHelper.setProperties(loadProperties("classpath:properties/pageHeper.properties"));
		return pageHelper;
	}

	protected List<Resource> getMapperLocations(String locationPattern) throws IOException {
		System.out.println("getMapperLocations " + locationPattern);
		List<Resource> ret = new ArrayList<Resource>();
		for (String path : locationPattern.split(","))
			ret.addAll(Arrays.asList(resolver.getResources(path)));
		return ret;
	}

	protected String getMapperBasePackage() {
		return "org.blue.webframework.sys.*.dao,org.blue.webframework.biz.*.dao";
	}

	@Bean
	@ConditionalOnMissingBean // 当容器里没有指定的Bean的情况下创建该对象
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer config = new MapperScannerConfigurer();
		config.setBasePackage(getMapperBasePackage());
		return config;
	}
}
