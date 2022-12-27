package com.shimbhu.Inheritance;

public class FinalClass {

	static  final int y=9;
	
	
	public static void main(String[] args) {
		final int x;
		System.out.println(y);
		x=20; //final variable cannot change value after it 
		//x=30;
		System.out.println(x);
	}
}
