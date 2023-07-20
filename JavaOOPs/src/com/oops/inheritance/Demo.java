package com.oops.inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("General brand.");
		
		Car car = new Car("TATA MOTORS");
		
		Bike bike = new Bike("Royal Enfield");
		
		System.out.println("this is for vehicle...");
		
		vehicle.startVehicle();
		vehicle.runVehicle();
		
		
		System.out.println("this is for car...");
		
		car.startVehicle();
		car.runVehicle();
		
		System.out.println("this is for bike...");
		
		bike.startVehicle();
		bike.runVehicle();
		
	}
}
