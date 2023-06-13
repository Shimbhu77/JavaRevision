package com.OOPs.Inheritance;

public class Female extends Human {


	private String gender = "Female";
	
	public String cooking()
	{
		return "female is looking for cooking.";
	}
	
	public String details(String name)
	{
		
		return "MY name is "+name+". And I am "+gender;
		
	}
	
	@Override
	public String walk() {
		
		return "Female is Walking.";
	}
	
    public static void main(String[] args) {
		
		Female female = new Female();
		
		System.out.println(female.details("Priyanka"));
		System.out.println(female.drink());
		System.out.println(female.eat());
		System.out.println(female.walk());
	}
}
