package com.shimbhu.Multithreading.Runnable;

public class TwoThreadOnSingleObject {

	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.setName("Keerthi");
		t2.setName("77");
		
		t1.start();
		t2.start();
		

		System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
		}
		
		System.out.println(" Main thread is Ended. ");
		
	}
}
