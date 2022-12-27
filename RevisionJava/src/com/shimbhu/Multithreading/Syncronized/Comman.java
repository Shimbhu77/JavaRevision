package com.shimbhu.Multithreading.Syncronized;

public class Comman {

	
	
	public synchronized  void hello(String name)
	{
		System.out.println("Hello ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
		
//       System.out.print(" My age is : ");
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(age);
	}
	
}
