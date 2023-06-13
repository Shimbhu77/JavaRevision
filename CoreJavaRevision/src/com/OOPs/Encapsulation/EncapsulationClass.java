package com.OOPs.Encapsulation;

public class EncapsulationClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Payal Kumawat");
		p.setAge(21);
		p.setIsMarried(false);
		
		System.out.println("Name : "+p.getName()+", Age : "+p.getAge()+", Married : "+p.getIsMarried());
	}
}
