package com.app.ioc.di.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		
		/* 
		 *	XML Based configuration 
		 */
		/*Resource resource = new ClassPathResource("Autowire-Config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		//ApplicationContext Container
		//ApplicationContext factory = new ClassPathXmlApplicationContext("Autowire-Config.xml");
		
		/*
		 *  Java Based Configuration
		 * 
		 */
		ApplicationContext factory = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		DemoBean_DI_Object obj = (DemoBean_DI_Object)factory.getBean(DemoBean_DI_Object.class);
		obj.show();
	}
}
