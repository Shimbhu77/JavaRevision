package com.oops.inheritance;

public class Vehicle {

	private String brand;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String brand) {
		
	    this.brand =brand;
	}
	
	
	public void startVehicle()
	{
		System.out.println( brand+ "engine is started of the vehicle.");
	}
	
	public void runVehicle()
	{
		System.out.println(brand+"vehicle is running on the road.");
	}
}
