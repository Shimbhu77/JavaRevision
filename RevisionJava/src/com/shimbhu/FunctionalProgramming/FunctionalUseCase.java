package com.shimbhu.FunctionalProgramming;

public class FunctionalUseCase {

	public static void main(String[] args) {
		
		// 3 ways 
		// 1. Way :  Implement interface on class  and create of object of that class and invoke methods
		// using a external or seperate class
		FunctionalClass fc = new FunctionalClass();
		
		fc.sayHello("Shimbhu");
		
		// 2. Way : //using Annonymous inner class
		//we can use Annonymous inner class without a FI also
		
		Functionl fi = new Functionl()
				{
			         @Override
			         public void sayHello(String name)
			         {
			        	 System.out.println("Welcome to Annonymous Inner class "+ name);
			         }
				};
		
		fi.sayHello("Alisha");
		
		// 3 way : Lambda expression 
		
		Functionl  fle = (String name) -> { System.out.println("Welcome to Lambda Expression : "+name); };
//		Functionl  fle = name -> System.out.println("Welcome to Lambda Expression : "+name);
		
		fle.sayHello("Nikita");
		
		// Second Interface implementing 
		
		System.out.println(" Implementing second interface *******************************   ");
		
//		FunctionalInterface2 fle2 = (String name,int age,String city) ->
//				{
//			         System.out.println("I am "+name+". "+"My age is "+age+". "+" I am from "+city+".");
//			         
//				};
		
		FunctionalInterface2 fle2 = (n,a,c) -> System.out.println("I am "+n+". "+"My age is "+a+". "+" I am from "+c+".");
		
		fle2.intro("Alisha",24,"Zurich");
		
		// Implementing return type method of interface
		
//		SumOfTwoNumber addition  = (a,b) -> a+b;
		
		SumOfTwoNumber addition = (int a,int b ) -> {
			
			return a+b;
			
		};
		
		int c = addition.sum(10, 20);
	
		
		System.out.println("sum of a = "+10+" and  b = "+20 +" is "+c+".");
		
		//  Creating student object
		
		System.out.println(" Creating student object ");
		
		StudentInterface sti = (r,n,m) -> new Student(r,n,m);
		
		Student st = sti.createStudentObject(1,"sk",988);
		System.out.println(st);
		
	}
	
}
