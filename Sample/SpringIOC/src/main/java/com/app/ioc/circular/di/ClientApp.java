package com.app.ioc.circular.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		
		/* 
		 *	XML configuration 
		 */
		Resource resource = new ClassPathResource("Circular-config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		A obj1 = (A)factory.getBean("a");
		
		
		
	}
}
