package com.shimbhu.Multithreading.ThreadClass;

public class Main {

	public static void main(String[] args) {
		
		Talk t = new Talk();
		
		Thread thread = new Thread(t);
		 
		t.sayHello();
		
		thread.start();
		

		System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
		}
		
		System.out.println(" Main thread is Ended. ");
		
	}
}
