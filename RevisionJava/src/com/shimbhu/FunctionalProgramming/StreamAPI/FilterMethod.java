package com.shimbhu.FunctionalProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.shimbhu.FunctionalProgramming.Student;

public class FilterMethod {

	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "N1", 750));
		students.add(new Student(12, "N2", 450));
		students.add(new Student(13, "N3", 650));
		students.add(new Student(14, "N4", 850));
		students.add(new Student(15, "N5", 410));
		
		
		//from the above list get another list of students whose marks is 
		//less than 500.
		
		// Long form 
		
		Stream<Student> st = students.stream();
		
		st = st.filter( s -> s.getMarks()<500);
		
		st.forEach( s -> System.out.println(s));
		
		// short form 
		
		System.out.println("************** Short Form ******************");
		
		students.stream().filter( s -> s.getMarks()>500).forEach( s -> System.out.println(s));
		
		System.out.println("************** Short Form and getting list formet  ******************");
		
	    List<Student> list =  students.stream().filter( s -> s.getMarks() > 600).collect(Collectors.toList());
		
         System.out.println(list);
		
	}
}
