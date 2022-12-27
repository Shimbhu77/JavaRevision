package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.function.Consumer;

import com.shimbhu.FunctionalProgramming.Student;

public class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		
		System.out.println("My roll is "+t.getRoll());
		System.out.println("My name is "+t.getName());
		System.out.println("My marks is "+t.getMarks());
		
	}

}
