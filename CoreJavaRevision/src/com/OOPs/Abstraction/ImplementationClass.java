package com.OOPs.Abstraction;

public class ImplementationClass extends AbstractClass {

	@Override
	public String details() {
		
		return "My name is Shimbhu Kumawat. I am from Jaipur.";
	}
	
	public static void main(String[] args) {
		
		ImplementationClass ic = new ImplementationClass();
		
		System.out.println(ic.details());
		System.out.println(ic.name());
		System.out.println(ic.myDetails());
		System.out.println(myDetails());
	}

}
