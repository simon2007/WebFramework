package org.blue.webframework.boot;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.blue.webframework.framework.BlueExceptionHandlerExceptionResolver;
import org.blue.webframework.web.admin.interceptors.AdminAuthFilter;
import org.blue.webframework.web.admin.tag.PrivilegeDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.dialect.SpringStandardDialect;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

public class BlueWebAppConfigurer implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		registry.enableContentNegotiation(new MappingJackson2JsonView());
	}
	
	/**
	 * 设置视图解析器
	 * @param templateEngine
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
	    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	    resolver.setTemplateEngine(templateEngine);
	    return resolver;
	}

	 @Autowired
	 private   WebApplicationContext webApplicationConnect;
	 
	/**
	 * 设置模板引擎
	 * @param templateResolver
	 * @return
	 */
	@Bean
	public SpringTemplateEngine templateEngine(){
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/thymeleaf/");//设置地址前缀
		templateResolver.setSuffix(".html");//设置后缀
		templateResolver.setCacheable(false);//设置不缓存
		templateResolver.setTemplateMode( TemplateMode.HTML);
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setApplicationContext(webApplicationConnect);
	    
		Set<IDialect> additionalDialects=new LinkedHashSet<IDialect>();
        //自定义方言
        additionalDialects.add(new PrivilegeDialect());
        additionalDialects.add(new SpringStandardDialect());

	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver);
	 // Message source, internationalization specific to emails
        templateEngine.setTemplateEngineMessageSource(emailMessageSource());
        templateEngine.setDialects(additionalDialects);
	    
	    return templateEngine;
	}

	@Bean
    public ResourceBundleMessageSource emailMessageSource() {
        final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("mail/MailMessages");
        return messageSource;
    }


	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		/* 是否通过请求Url的扩展名来决定media type */
		configurer.favorPathExtension(true)
				/* 不检查Accept请求头 */
				.ignoreAcceptHeader(true).parameterName("mediaType")
				/* 设置默认的media yype */
				.defaultContentType(MediaType.TEXT_HTML)
				/* 请求以.html结尾的会被当成MediaType.TEXT_HTML */
				.mediaType("html", MediaType.TEXT_HTML)
				/* 请求以.json结尾的会被当成MediaType.APPLICATION_JSON */
				.mediaType("json", MediaType.APPLICATION_JSON);

	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver commonsMultipartResolver() {
		return new CommonsMultipartResolver();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 可添加多个
		registry.addInterceptor(new AdminAuthFilter()).addPathPatterns("/admin/**");
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

		resolvers.add(new BlueExceptionHandlerExceptionResolver());
		// resolvers.add(new BlueExceptionHandler());
	}

}
