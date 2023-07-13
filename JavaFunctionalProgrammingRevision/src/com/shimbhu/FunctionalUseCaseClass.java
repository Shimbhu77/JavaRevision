package com.shimbhu;

public class FunctionalUseCaseClass {

	public static void main(String[] args) {
		
		
		// 1 way. using functional class 
		
		FunctionalClass fc = new FunctionalClass();
		
		fc.welcome("Payal");
		
		// 2 way. using anonymous class
		
		FunctionalInterface1 fc1 = new FunctionalInterface1() {

			@Override
			public void welcome(String name) {
				
				System.out.println("welcome to anonymous class : "+name);
				
			}
			
		};
		
		fc1.welcome("Shimbhu");
		
		// 3 way. lambda expression 
		
		FunctionalInterface1 fce = (String name) -> {System.out.println("welcome to lambda expression: "+name);};
		FunctionalInterface1 fce2 = name -> System.out.println("welcome to advance lambda expression: "+name);
	    
		fce.welcome("Yashtika");
		fce2.welcome("Nikki");
		
		// add two numbers using lambda expression
		
		Calculation c1 = (n1,n2) -> {
			
			return n1+n2;
		};
		Calculation c2 = (n1,n2) ->n1+n2;
		
		System.out.println("addition of two numbers is this : "+c1.add(2, 5));
		System.out.println("addition of two numbers in advance expression is this : "+c2.add(6, 5));
		
		// object creation using lambda expression
		
		
		UserInterface ui = (i,n,c) -> new User(i,n,c);
		
		 System.out.println(ui.creatUser(1, "Payal", "Chomu"));
		 System.out.println(ui.creatUser(2, "Shimbhu", "Jaipur"));
		
		
	}
}
