package com.shimbhu.Multithreading.ThreadClass;

public class Talk  extends SayHello implements Runnable{

	@Override
	public void run() {
		

		System.out.println("new   thread is starting. ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("new  thread is running  i : "+i );
		}
		
		System.out.println("new  thread is ending.");
		
	}

}
