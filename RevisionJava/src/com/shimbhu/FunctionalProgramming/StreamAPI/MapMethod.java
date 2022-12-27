package com.shimbhu.FunctionalProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.shimbhu.FunctionalProgramming.Student;

public class MapMethod {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "N1", 750));
		students.add(new Student(12, "N2", 450));
		students.add(new Student(13, "N3", 650));
		students.add(new Student(14, "N4", 850));
		students.add(new Student(15, "N5", 410));
		
		// Long form 
		
		Stream<Student> str1 = students.stream();
		
		Stream<Student> str2 = str1.map( s -> {
			 Student st = new Student(s.getRoll(),s.getName(),s.getMarks()+100);
			 return st;
		});
		
		List<Student> modifiedList = str2.collect(Collectors.toList());
		
		System.out.println(modifiedList);
		
		// short form 
		
		List<Student> modifiedList2 = students.stream()
				.map( s -> new Student(s.getRoll(),s.getName(),s.getMarks()-100))
				.collect(Collectors.toList());
		System.out.println(modifiedList2);
		
		// predicate condition 
		
		List<Student> modifiedList3 = students.stream()
				.filter(s -> s.getMarks()>500)
				.map( s -> new Student(s.getRoll(),s.getName(),s.getMarks()-100))
				.collect(Collectors.toList());
		System.out.println(modifiedList3);
		
		
	}
}
