package com.shimbhu.FunctionalProgramming.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.shimbhu.FunctionalProgramming.Student;

public class DemoConsumer {

	public static void main(String[] args) {
		
		System.out.println("****************** separate class  ****************");
		MyConsumer myc = new MyConsumer();
		
		myc.accept(new Student(1,"Alina",889));
		
		System.out.println("****************** Lambda Expression ****************");
		
		Consumer<Student> myc1 = (t) -> {
			
			System.out.println("My roll is "+t.getRoll());
			System.out.println("My name is "+t.getName());
			System.out.println("My marks is "+t.getMarks());
			
		};
		
		myc1.accept(new Student(10,"Vica",869));
		
		System.out.println("****************** List  ****************");
		

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 780));
		students.add(new Student(12, "N2", 480));
		students.add(new Student(13, "N3", 680));
		students.add(new Student(14, "N4", 380));
		students.add(new Student(15, "N5", 580));
		students.add(new Student(16, "N6", 720));
		
		students.forEach( s -> System.out.println(" My name is "+s.getName().toLowerCase()));
	}
}
