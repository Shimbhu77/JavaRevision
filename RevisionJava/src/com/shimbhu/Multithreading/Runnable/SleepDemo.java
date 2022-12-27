package com.shimbhu.Multithreading.Runnable;

public class SleepDemo {

	public static void main(String[] args) {
		
		SleepMethod sm = new SleepMethod();
		
		Thread t  = new Thread(sm);
		
		t.start();
		

		System.out.println(" Main thread is started.");
		
		for(int j=100;j<200;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
		}
		
		
		System.out.println("End of main");
	}
}
