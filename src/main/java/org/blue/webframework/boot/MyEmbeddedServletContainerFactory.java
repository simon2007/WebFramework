package org.blue.webframework.boot;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;


public class MyEmbeddedServletContainerFactory
{
	@Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory webServerFactory = new TomcatServletWebServerFactory();
        webServerFactory.setPort(8080);
        webServerFactory.setContextPath("/WebFramework");
        webServerFactory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        return webServerFactory;
    }

}
