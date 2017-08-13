package com.app.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoBean_DI_Object {
	
	private TestBean testBean;
	
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	public void show() {
		System.out.println(testBean.message());
	}
}

