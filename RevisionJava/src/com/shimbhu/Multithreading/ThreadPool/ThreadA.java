package com.shimbhu.Multithreading.ThreadPool;

public class ThreadA  implements Runnable{

	
	String name;
	
	public ThreadA(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name+" has started job."+" thread name is : "+Thread.currentThread().getName());
		
	    try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name+" has ended job."+" thread name is : "+Thread.currentThread().getName());
		
		
		
	}

}
