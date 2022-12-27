package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.function.Supplier;

import com.shimbhu.FunctionalProgramming.Student;

public class MySupplier implements Supplier<Student> {

	@Override
	public Student get() {
		
		return new Student(1,"Alisha",678);
	}

}
