package com.shimbhu.Multithreading.Lock.ObjectLevel;

public class Demo {

	public  static void main(String[] args) {
		
		Comman c1 = new Comman();
		Comman c2= new Comman();
		
		A t1 = new A("Radha","Jaipur",c1);
		B t2 = new B("Rani","Delhi",c2);
	
		t1.start();
		t2.start();
		
		System.out.println("End of Main ");
		
	}
}
