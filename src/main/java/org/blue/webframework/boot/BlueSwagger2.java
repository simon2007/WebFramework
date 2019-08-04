package org.blue.webframework.boot;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix="swagger",name = "enabled", havingValue = "true")
public class BlueSwagger2 {

	Logger logger=LogManager.getLogger(getClass());
	@Value(value = "${swagger.basePackage:org}")
	String basePackage;

	/**
	 * 创建API应用 appinfo()增加API相关信息
	 * 通过select()函数返回一个ApiSelectorBuilder实例，用来控制那些接口暴露给Swagger来展现
	 * 本例采用置顶扫描的包路径来定义指定要建立API的目录
	 *
	 * @return
	 */
	@Bean
	@ConditionalOnMissingBean
	public Docket createRestApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);

		docket.apiInfo(apiInfo());
		docket.groupName("资源管理");
		docket.select();
		
		ApiSelectorBuilder builder = docket.select();
		if (StringUtils.isNotBlank(getBasePackage()))
			builder.apis(RequestHandlerSelectors.basePackage(getBasePackage()));// 为当前包下controller生成API文档
		builder.apis(RequestHandlerSelectors.withClassAnnotation(Api.class)); // 为有@Api注解的Controller生成API文档
		builder.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)); // 为有@ApiOperation注解的方法生成API文档
		docket=builder.paths(PathSelectors.any()).build();
		docket.pathMapping("/");
		

		logger.info("createRestApi");
		return docket;
	}

	protected String getBasePackage() {
		logger.info("basePackage="+basePackage);
		return basePackage;
	}

	/**
	 * 创建改API的基本信息（这些基本信息会展示在文档页面中） 访问地址： http://项目实际地址/swagger-ui.html
	 * 
	 * @return
	 */
	public ApiInfo apiInfo() {
		Contact contact = new Contact("WebFramework", "", "xxx@xx.com");
		ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("WebFramework API");
		builder.description("内容管理接口");
		builder.version("1.0.0");
		builder.contact(contact);

		return builder.build();
	}
}
