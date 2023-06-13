package com.OOPs.Inheritance;

public class Male extends Human{

	private String gender = "Male";
	
	public String hunting()
	{
		return "Male is looking for hunting.";
	}
	
	public String details(String name)
	{
		
		return "MY name is "+name+". And I am "+gender;
		
	}
	
	@Override
	public String walk() {
		
		return "Male is Walking.";
	}
	
	public static void main(String[] args) {
		
		Male male = new Male();
		
		System.out.println(male.details("Somesh"));
		System.out.println(male.drink());
		System.out.println(male.eat());
		System.out.println(male.walk());
		
        Female female = new Female();
		
		System.out.println(female.details("Priyanka"));
	}
}
