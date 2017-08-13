package com.app.ioc.di;

public class DemoBean {
	
	private String message;
	
	
	// DI - Setter Injection 
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void show() {
		System.out.println(message);
	}
}
