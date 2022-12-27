package com.shimbhu.Multithreading.Runnable;

public class Main {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		Thread t = new Thread(d);
		
		t.start();
		
		System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
		}
		
		System.out.println(" Main thread is Ended. ");
	}
}
