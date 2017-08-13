package com.app.ioc.Test1;

public class MotorBike implements Vechicle {

	private int maxSpeed;
	
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void move() {
		System.out.println("Fuel Type: Petrol");
		System.out.println("Max speed:"+maxSpeed);
		System.out.println("Bike started...");
	}
}
