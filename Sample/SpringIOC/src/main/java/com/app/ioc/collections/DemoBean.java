package com.app.ioc.collections;

public class DemoBean {
	
	private String message;
	
	
	// DI - Setter Injection 
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void show() {
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return "DemoBean [message=" + message + "]";
	}
	
}
