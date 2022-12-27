package com.shimbhu.Multithreading.Runnable;

public class Main2 {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.setName("Alisha");
		t2.setName("Nikki");
		
		t1.setPriority(9);
		t1.setPriority(7);
		
		t1.start();
		t2.start();
		

		System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
			System.out.println("Main thread name is : "+ Thread.currentThread().getName());
		}
		
		System.out.println(" Main thread is Ended. ");
		
	}
}
