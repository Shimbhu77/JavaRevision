package com.shimbhu.Multithreading.Syncronized;

public class Demo {

	public  static void main(String[] args) {
		
		Comman c = new Comman();
		
		A t1 = new A("Radha",c);
		B t2 = new B("Rani",c);
	
		t1.start();
		t2.start();
		
		System.out.println("End of Main ");
		
	}
}
