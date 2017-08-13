package com.app.ioc.Test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		
		/* 
		 *	XML configuration 
		 */
		Resource resource = new ClassPathResource("Test1-config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Journey obj1 = (Journey)factory.getBean("traveller_car");
		obj1.startJourney();
		
		Journey obj2 = (Journey)factory.getBean("traveller_MotorBike");
		obj2.startJourney();
		
	}
}
