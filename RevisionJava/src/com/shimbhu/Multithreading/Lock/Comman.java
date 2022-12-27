package com.shimbhu.Multithreading.Lock;

public class Comman {

	public static synchronized  void hello(String name)
	{
		System.out.println("Hello ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
	
	}
	
}
