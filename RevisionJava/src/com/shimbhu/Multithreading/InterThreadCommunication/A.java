package com.shimbhu.Multithreading.InterThreadCommunication;

public class A implements Runnable {

	int total=0;
	@Override
	public void run() {
		
		System.out.println("new thread is started.");
		
		synchronized (this) {
			
			for(int i=0;i<1000000;i++)
			{
				total=total+i;
			}
			
			System.out.println("thread is ended. total is "+total);
			
			System.out.println("child thread give notification.");
			
			this.notify();
		}
		
	    for(int i=0;i<10;i++)
	    {
	    	System.out.println(" i value is : "+i);
	    }

	}

}
