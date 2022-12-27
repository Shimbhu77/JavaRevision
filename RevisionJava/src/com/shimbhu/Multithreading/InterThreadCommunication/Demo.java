package com.shimbhu.Multithreading.InterThreadCommunication;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		A a =new A();
		
		Thread t =  new Thread(a);
		
		t.start();
		
		t.sleep(1000);
		
       // t.join();
		
		//t.sleep(1);
         		
		synchronized (a) {
			
			System.out.println("main thread is calling wait method");
			
			a.wait(5000);
			
			System.out.println("main thread got notification.");
			
			System.out.println(a.total);
		}
		
		System.out.println("total is "+a.total);
		
		
		
	}
}
