package com.shimbhu.Multithreading.Runnable;

public class Demo3 implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" thread is starting. ");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" thread is running  i : "+i );
		}
		
		System.out.println(Thread.currentThread().getName()+" thread is ending.");
	}

}
