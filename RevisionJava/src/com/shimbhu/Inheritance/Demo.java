package com.shimbhu.Inheritance;

public class Demo extends Female {

	int age=30; 
	
	public static void main(String[] args) {
		new Demo().skin();
		System.out.println(" age is : "+new Demo().age);
	}
	
	@Override
	public void skin() {
		
		super.walk();
		System.out.println("Woman has white skin and golden hair");
		System.out.println(" age is : "+super.age);
	}
	
}
