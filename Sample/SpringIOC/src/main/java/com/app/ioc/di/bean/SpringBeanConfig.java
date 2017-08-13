package com.app.ioc.di.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean
	public DemoBean_DI_Object demoBeanDIObject(){
		return new DemoBean_DI_Object();
	}
	
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
}
