package com.oops;

public class Demo {
	
	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle();
		
		Car car = new Car();
		
		Bike bike = new Bike();
		
		System.out.println("============ Vehicle ========");
		
		vehicle.startEngine();
		
		vehicle.run();
		
		System.out.println("============ Car ========");
		
		car.startEngine();
		car.run();
		
		System.out.println("============ Bike ========");
//		bike.run();
		bike.startEngine();
		bike.run();
	}

}
