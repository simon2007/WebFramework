package org.blue.webframework.boot;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.blue.webframework.framework.BlueExceptionHandler;
import org.blue.webframework.framework.result.WebApiResultConverter;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.blue.webframework.web.admin.interceptors.AdminAuthInterceptor;
import org.blue.webframework.web.admin.interceptors.CSRFInterceptor;
import org.blue.webframework.web.admin.tag.PrivilegeDialect;
import org.blue.webframework.web.admin.tag.SpringDialect;
import org.blue.webframework.web.webapi.interceptors.SecureInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafView;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

public class BlueWebAppConfigurer implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).maxAge(3600);
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}


	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		registry.viewResolver(thymeleafViewResolver());

		registry.enableContentNegotiation( new ThymeleafView());

	}
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(0,new WebApiResultConverter());
	}
	


	@Bean
	public SpringTemplateEngine thymeleafEngine() {
		SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
		springTemplateEngine.setDialect(new SpringDialect());
		springTemplateEngine.addDialect(new PrivilegeDialect(privilegeService));

		springTemplateEngine.setEnableSpringELCompiler(true);
		springTemplateEngine.setTemplateResolver(templateResolver());
		
		return springTemplateEngine;
	}

	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver() ;
		thymeleafViewResolver.setTemplateEngine(thymeleafEngine());
		thymeleafViewResolver.setCharacterEncoding("UTF-8");
		thymeleafViewResolver.setViewNames(new String[] { "*.html", "*.xhtml" });
		thymeleafViewResolver.setCache(true);
		
		Map<String, Object> oldStaticVariables = thymeleafViewResolver.getStaticVariables();
        Map<String, Object> staticVariables =new HashMap<String,Object>(oldStaticVariables);
        staticVariables.put("global", createGlobal());
		return thymeleafViewResolver;
	}
	
	protected Object createGlobal()
	{
		return new HashMap<String,Object>();
	}

	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		String url=getClass().getProtectionDomain().getCodeSource().getLocation().toString();

		if(url.contains(".jar") )
			templateResolver.setPrefix("classpath:/META-INF/resources/WEB-INF/thymeleaf/");
		else
			templateResolver.setPrefix("/WEB-INF/thymeleaf/");
		
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setCacheable(true);
		return templateResolver;

	}

	/* ******************************************************************* */
	/* GENERAL CONFIGURATION ARTIFACTS */
	/* Static Resources, i18n Messages, Formatters (Conversion Service) */
	/* ******************************************************************* */

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("/static/images/");
		registry.addResourceHandler("/css/**").addResourceLocations("/static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/static/js/");
	}

	@Override
	public void addFormatters(final FormatterRegistry registry) {

		registry.addFormatter(dateFormatter());
	}

	@Bean
	public DateFormatter dateFormatter() {
		return new DateFormatter();
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
				.mediaType("json", MediaType.APPLICATION_JSON_UTF8)
				.mediaType("xml", MediaType.APPLICATION_XML);

	}

	@Resource
	protected PrivilegeService privilegeService;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		//可添加多个
		registry.addInterceptor(new AdminAuthInterceptor(privilegeService)).addPathPatterns("/admin/**")
				.excludePathPatterns("/admin/login");
		registry.addInterceptor(new CSRFInterceptor()).addPathPatterns("/admin/**");
		registry.addInterceptor(new SecureInterceptor()).addPathPatterns("/webapi/**");
		registry.addInterceptor(localeChangeInterceptor());
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	@Autowired
	private BlueExceptionHandler blueExceptionHandler;
	
	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

		resolvers.add(blueExceptionHandler);
		// resolvers.add(new BlueExceptionHandler());
	}


}
