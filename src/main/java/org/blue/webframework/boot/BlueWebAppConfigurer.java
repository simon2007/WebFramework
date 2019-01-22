package org.blue.webframework.boot;

import java.util.List;

import javax.annotation.Resource;

import org.blue.webframework.framework.BlueExceptionHandlerExceptionResolver;
import org.blue.webframework.sys.account.service.PrivilegeService;
import org.blue.webframework.web.admin.interceptors.AdminAuthFilter;
import org.blue.webframework.web.admin.interceptors.CSRFFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

public class BlueWebAppConfigurer implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		registry.enableContentNegotiation(new FastJsonJsonView());
	}
	
	
	/* ******************************************************************* */
    /*  GENERAL CONFIGURATION ARTIFACTS                                    */
    /*  Static Resources, i18n Messages, Formatters (Conversion Service)   */
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
				.mediaType("json", MediaType.APPLICATION_JSON);

	}

	@Resource
	private PrivilegeService privilegeService;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 可添加多个
		registry.addInterceptor(new AdminAuthFilter(privilegeService)).addPathPatterns("/admin/**").excludePathPatterns("/admin/login");
		registry.addInterceptor(new CSRFFilter()).addPathPatterns("/admin/**");
        registry.addInterceptor(localeChangeInterceptor());
	}
	

	@Bean  
    public LocaleChangeInterceptor localeChangeInterceptor() {  
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();  
        lci.setParamName("lang");  
        return lci;  
    } 

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

		resolvers.add(exceptionHandlerExceptionResolver());
		// resolvers.add(new BlueExceptionHandler());
	}

	
	@Bean
	public BlueExceptionHandlerExceptionResolver exceptionHandlerExceptionResolver()
	{
		return new BlueExceptionHandlerExceptionResolver();
	}
}
