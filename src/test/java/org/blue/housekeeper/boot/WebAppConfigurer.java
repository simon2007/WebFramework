package org.blue.housekeeper.boot;

import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.blue.webframework.boot.BlueWebAppConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@EnableWebMvc
@Configuration
public class WebAppConfigurer extends BlueWebAppConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods("GET", "POST")
				.maxAge(3600);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/static/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/static/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/static/js/");
		registry.addResourceHandler("/laydate/**").addResourceLocations("/static/laydate/");
		registry.addResourceHandler("/layui/**").addResourceLocations("/static/layui/");

	}


	/*
	public void handleReturnValue(Object returnValue, MethodParameter returnType,ModelAndViewContainer mavContainer, NativeWebRequest webRequest)throws IOException, HttpMediaTypeNotAcceptableException, HttpMessageNotWritableException {
        mavContainer.setRequestHandled(true);
        // Try even with null return value. ResponseBodyAdvice could get involved.
        writeWithMessageConverters(returnValue, returnType, webRequest);
    }
*/
	
	 @Bean
	    public HttpMessageConverter<String> responseBodyConverter() {
			logger.info("responseBodyConverter");
	        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	    }

	 

	Logger logger=Logger.getLogger(getClass());
	


	@Bean  
    public LocaleChangeInterceptor localeChangeInterceptor() {  
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();  
        lci.setParamName("lang");  
        return lci;  
    }  

}
