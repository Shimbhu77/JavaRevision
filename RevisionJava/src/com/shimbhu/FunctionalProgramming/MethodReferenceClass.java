package com.shimbhu.FunctionalProgramming;

public class MethodReferenceClass {

	public static void funX(String name)
	{
		System.out.println("name is "+name);
	}
	
	public void funY(String name)
	{
		System.out.println("name is "+name);
	}
	
	public MethodReferenceClass(String name)
	{
		System.out.println("welcome to India , "+name);
	}
	
	public MethodReferenceClass()
	{
		System.out.println("welcome to constructor.");
	}
	
	public static void main(String[] args) {
		
		// lambda expression 
		
		Functionl fl = (name) -> System.out.println("Welcome "+name);
		
		fl.sayHello("shimbhu");
		
		// static method reference 
		
		Functionl fl2 = MethodReferenceClass::funX;
		
		fl2.sayHello("Alisha");
		
		
		// non static method reference 
		
		Functionl fl3 = new MethodReferenceClass()::funY;
		
		fl3.sayHello("Alina");
		
		// constructor method reference
		
		Functionl fl4 = MethodReferenceClass::new ;
		
		fl4.sayHello("Vica");
	}
	
}
