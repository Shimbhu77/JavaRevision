package com.shimbhu.Basics;

class Animal {
	String name;

	public Animal() {
		    System.out.println("inside constructor");
			this.name = "Default Name";
	}

	// This is called a one argument constructor.
	public Animal(String name) {
			this.name = name;
	}

	public static void main(String[] args) {
			Animal animal = new Animal();
			System.out.println(animal);
	}
}
