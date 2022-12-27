package com.shimbhu.Multithreading.Runnable;

public class Demo1  implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Demo 1  thread is starting. ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(" Demo 1  thread is running  i : "+i  );
			System.out.println(" Demo 1 thread name is : "+Thread.currentThread().getName());
		}
		
		System.out.println("Demo 1  thread is ending.");
	}

}
