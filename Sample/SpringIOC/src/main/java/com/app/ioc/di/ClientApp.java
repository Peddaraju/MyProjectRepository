package com.app.ioc.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		
		/* 
		 *	XML configuration 
		 */
		Resource resource = new ClassPathResource("Spring-config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//ApplicationContext Container
		//ApplicationContext factory = new ClassPathXmlApplicationContext("Spring-config.xml");
		
		DemoBean_DI_Object obj = (DemoBean_DI_Object)factory.getBean("DIObj2");
		obj.show();
		
	}
}
