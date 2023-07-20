package com.oops.inheritance;

public class Bike  extends Vehicle{

	public Bike(String brand) {
		super(brand);
	}
	
	@Override
	public void startVehicle()
	{
		System.out.println("Bike engine is started.");
	}
	
	@Override
	public void runVehicle()
	{
		System.out.println("Bike is running on the road.");
	}
	
	
}
