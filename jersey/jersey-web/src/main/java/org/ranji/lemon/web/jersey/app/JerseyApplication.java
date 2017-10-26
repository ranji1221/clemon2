package org.ranji.lemon.web.jersey.app;

import java.util.concurrent.TimeUnit;
import org.ranji.lemon.common.core.app.CoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.ranji.lemon.web.jersey.controller"})
public class JerseyApplication extends CoreApplication{
	public static void main(String[] args) {
		SpringApplication.run(JerseyApplication.class, args);  
	}
	
	//-- 自己的应用的服务器设置
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	    TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
	    factory.setPort(80);
	    factory.setContextPath("/jersey");
	    factory.setSessionTimeout(60, TimeUnit.MINUTES);
	    return factory;
	}
}
