package com.shimbhu.Multithreading.Lock;

public class Demo {

	public  static void main(String[] args) {
		
		Comman c1 = new Comman();
		Comman c2= new Comman();
		
		A t1 = new A("Radha",c1);
		B t2 = new B("Rani",c2);
	
		t1.start();
		t2.start();
		
		System.out.println("End of Main ");
		
	}
}
