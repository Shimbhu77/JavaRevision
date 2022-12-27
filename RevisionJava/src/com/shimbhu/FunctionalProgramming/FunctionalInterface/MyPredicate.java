package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.shimbhu.FunctionalProgramming.Student;

public class MyPredicate implements Predicate<Student> {

	@Override
	public boolean test(Student t) {
		
		return t.getMarks()>480 ? true:false;
	}

	

	
	
}
