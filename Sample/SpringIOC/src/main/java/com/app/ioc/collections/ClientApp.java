package com.app.ioc.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.app.ioc.di.DemoBean_DI_Object;

public class ClientApp {

	public static void main(String[] args) {
		
		/* 
		 *	XML configuration 
		 */
		// BeanFactory Container
		/*Resource resource = new ClassPathResource("Collections-config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		//ApplicationContext Container
		ApplicationContext factory = new ClassPathXmlApplicationContext("Collections-config.xml");
		
		TestBean obj = (TestBean)factory.getBean("id1");
		System.out.println(obj.getS());
		obj.printList();
		System.out.println("--------");
		obj.printMap();		
		
	}
}
