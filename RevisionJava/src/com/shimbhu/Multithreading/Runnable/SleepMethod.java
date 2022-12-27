package com.shimbhu.Multithreading.Runnable;

public class SleepMethod implements Runnable {

	@Override
	public void run() {
		
		System.out.println("new thread is starting.");
	    
		for(int i=0;i<5;i++)
	    {
			System.out.println(" i is : "+i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
			
				e.getMessage();
			}
			
	    	
	    }
	    
	    System.out.println("new thread is ending.");
	    
	}
	
	
}
