package com.shimbhu.Multithreading.Runnable;

public class Demo implements Runnable {

	@Override
	public void run() {
		
		System.out.println("new thread is starting. ");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(" thread is running  i : "+i );
		}
		
		System.out.println("new thread is ending.");
	}

}
