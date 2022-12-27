package com.shimbhu.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentClassByMarks {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 500));
		students.add(new Student(12, "N2", 400));
		students.add(new Student(13, "N3", 520));
		students.add(new Student(14, "N4", 450));
		students.add(new Student(15, "N5", 410));
		
		// using external class
		
//		System.out.println("Before sorting "+students);
//		
//		Collections.sort(students, new StudentMarksComparator());
//		
//		System.out.println("after sorting "+students);
		
		// Annonymous class 
		
//		Collections.sort(students, new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student s1 ,Student s2 )
//			{
//				return s1.getMarks()>s2.getMarks() ? -1 : 1 ;
//			}
//		});
//		
//		System.out.println(students);
		
		
		// Lambda Expression 
		
		Collections.sort(students , (s1,s2) -> s1.getMarks()>s2.getMarks() ? -1 : 1);
		
		System.out.println(students);
	}
	
}
