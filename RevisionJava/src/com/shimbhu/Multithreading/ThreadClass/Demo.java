package com.shimbhu.Multithreading.ThreadClass;

public class Demo extends Thread {
	
	@Override
	public void run() {

		System.out.println("new thread is starting. ");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(" thread is running  i : "+i );
		}
		
		System.out.println("new thread is ending.");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		d.start();
		
        System.out.println(" Main thread is started.");
		
		for(int j=100;j<110;j++)
		{
			System.out.println(" Main thread is running and j is : "+j);
		}
		
		System.out.println(" Main thread is Ended. ");
	}

}
