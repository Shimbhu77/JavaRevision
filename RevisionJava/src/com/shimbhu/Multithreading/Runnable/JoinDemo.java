package com.shimbhu.Multithreading.Runnable;

public class JoinDemo {

	public static void main(String[] args) {
		
		JoinMethod d  = new JoinMethod();
		
		Thread t = new Thread(d);
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		int result = d.sum;
        
		System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
			System.out.println("sum is : "+result);
		}
		
		System.out.println(" Main thread is Ended. ");
		
		
	}
}
