package com.shimbhu.Multithreading.Runnable;

public class Demo2  implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Demo 2  thread is starting. ");
		
		for(int i=51;i<=60;i++)
		{
			System.out.println(" Demo 2  thread is running  i : "+i );
			System.out.println(" Demo 2 thread name is : "+Thread.currentThread().getName());
		}
		
		System.out.println("Demo 2  thread is ending.");
	}

}
