package com.app.ioc.Test1;

public class Traveller implements Journey {

	private Vechicle v;

	public void setV(Vechicle v) {
		this.v = v;
	}

	public void startJourney() {
		System.out.println("journey started..");
		v.move();
	}

}
