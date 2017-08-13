package com.app.ioc.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DemoBean_DI_Object {
	
	@Autowired
	@Qualifier("testBean")
	private TestBean testBean;
	
	
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	public void show() {
		System.out.println(testBean.message());
	}
}

