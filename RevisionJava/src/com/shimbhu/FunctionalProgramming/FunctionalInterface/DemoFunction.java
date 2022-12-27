package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.function.Function;

import com.shimbhu.FunctionalProgramming.Student;

public class DemoFunction {

	public static void main(String[] args) {
		
		// separate class 
		MyFunction myf = new MyFunction();
		
		System.out.println(myf.apply(new Student(1,"Vica",489)));
		System.out.println(myf.apply(new Student(2,"Alina",889)));
		
		
		// Lambda expression 
		
		Function<String,String> myf2 = (n) -> "welcome "+n+" to Germany.";
		System.out.println(myf2.apply("Shimbhu"));
	}
}
