package com.OOPs.Abstraction;

public abstract class AbstractClass {

	public abstract String details();
	
	public String name()
	{
		return "My name is Payal Kumawat.";
	}
	
	public static String myDetails()
	{
		return "I am Payal Kumawat. I am Jaipur.";
	}
	
	public static void main(String[] args) {
		
		AbstractClass abs = new AbstractClass() {
			
			@Override
			public String details() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
