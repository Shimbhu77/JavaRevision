package com.shimbhu.Multithreading.Runnable;

public class JoinMethod implements Runnable {

	int sum;
	@Override
	public void run() {

		System.out.println("new thread is starting.");
	    
		for(int i=0;i<=5;i++)
	    {
			System.out.println(" sum in new thread is : "+sum);
			sum=sum+i;
	    }
	    
	    System.out.println("new thread is ending.");
	}

	
}
