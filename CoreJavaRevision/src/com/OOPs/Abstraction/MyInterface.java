package com.OOPs.Abstraction;

public interface MyInterface {

	public default void intrDetails()
	{
		System.out.println("I am interface's default method.");
	}
	
	public static void intrDetails2()
	{
		System.out.println("I am interface's static method.");
	}
	
	public void detais();
	
	
}
