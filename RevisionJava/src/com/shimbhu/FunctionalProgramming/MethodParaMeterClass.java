package com.shimbhu.FunctionalProgramming;

public class MethodParaMeterClass {

	static public void funA(Functionl fl)
	{
		System.out.println("inside funA() method");
		
		System.out.println("method parameter ");
		
		fl.sayHello("Ram");
	}
	
	public static void main(String[] args) {
		
		MethodParaMeterClass mp  = new MethodParaMeterClass();
		
		funA((name) -> System.out.println("welcome "+name));
	}
	
}
