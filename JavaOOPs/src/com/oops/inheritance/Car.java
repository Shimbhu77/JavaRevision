package com.oops.inheritance;

public class Car extends Vehicle {

	public Car(String brand) {
		super(brand);
	}
	
	@Override
	public void startVehicle()
	{
		System.out.println("car engine is started.");
	}
	
//	@Override
//	public void runVehicle()
//	{
//		System.out.println("car  is running on the road.");
//	}
}
