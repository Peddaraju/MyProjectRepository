package com.app.ioc.circular.di;

public class A {
	
	private B b;


	public void setA(B b) {
		this.b = b;
	}
	
/*	public A(B b) {
		this.b = b;
	}*/

}
