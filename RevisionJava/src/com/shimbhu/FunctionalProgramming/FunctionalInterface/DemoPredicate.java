package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.shimbhu.FunctionalProgramming.Student;

public class DemoPredicate {

	public static void main(String[] args) {
		
//		PredicateImplement pi = new PredicateImplement();
//		
//		System.out.println(pi.test(new Student(1,"Vica",479)));
//		
//		Predicate<Student> p = s -> s.getMarks()>400;
//		
//		System.out.println(p.test(new Student(1,"Vica",399)));
		
		
		// sorting the list of students based on marks
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 780));
		students.add(new Student(12, "N2", 480));
		students.add(new Student(13, "N3", 680));
		students.add(new Student(14, "N4", 380));
		students.add(new Student(15, "N5", 580));
		students.add(new Student(16, "N6", 720));
		
		students.removeIf(s -> s.getMarks()<650);
		
		System.out.println(students);
		
	}
}
