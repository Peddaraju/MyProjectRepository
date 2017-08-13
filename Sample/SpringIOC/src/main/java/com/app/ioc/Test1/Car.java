package com.app.ioc.Test1;

public class Car implements Vechicle{
	
	private String fuelType;
	private int maxSpeed;
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Max Speed:"+maxSpeed);
		System.out.println("Car started...");
		
	}
	
	
	

}
