package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.function.Function;

import com.shimbhu.FunctionalProgramming.Student;

public class MyFunction  implements Function<Student, String> {

	@Override
	public String apply(Student t) {
		
		return t.getMarks() > 500 ? "Pass" : "Fail";
	}

}
