package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.function.Supplier;

import com.shimbhu.FunctionalProgramming.Student;

public class DemoSupplier {

	public static void main(String[] args) {
		
		// separate class 
		MySupplier mys = new MySupplier();
		
		System.out.println(mys.get());
		
		// lambda expression 
		
		Supplier<Student> st = () -> new Student(1,"Shimbhu",998);
		
		System.out.println(st.get());
		
		
		
	}
	
}
