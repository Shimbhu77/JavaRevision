package com.OOPs.PolyMorphism;

public class PolymorphismClass {

	public static String makeLong(String name)
	{
		return "My name is : "+name;
	}
	
	public static String makeLong(int age)
	{
		return "My age is : "+age;
	}
	
	public static void main(String[] args) {
		
		String message = makeLong("Payal Kumawat");
		
		System.out.println(message);
		
		String ageMessage = makeLong(21);
		
		System.out.println(ageMessage);
		
		
		
	}
}
