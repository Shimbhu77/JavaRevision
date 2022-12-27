package com.shimbhu.Inheritance.downcasting;

public class Dog extends Animal {

	public void eat()
	{
		System.out.println(" dog is eating food.");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		a.walk();
		//a.eat(); need to downcast the object 
		
		Dog d = (Dog)a; // downcasted object to child class object 
		d.walk();
		d.eat();
		
	}
}
