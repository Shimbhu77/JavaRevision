package com.shimbhu.FunctionalProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("one","two","three","four");
		
		Stream<String> str = list.stream();
		
		
		// terminal method 
		
		str.forEach( s -> System.out.print(s+" "));
		
		// str.forEach( s -> System.out.println(s)); illegalStatement Exception 
		
		
		
		
		

	}
	
}
