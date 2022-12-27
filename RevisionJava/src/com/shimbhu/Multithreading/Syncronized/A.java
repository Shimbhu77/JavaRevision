package com.shimbhu.Multithreading.Syncronized;

public class A extends Thread {

	String name;
	Comman c;
	
	
	public A(String n,Comman c) {
		this.name=n;
		this.c=c;
	}
	
	@Override
	public void run() {
//		System.out.println(" A thread is started. ");
		
		c.hello(name);
		
//		System.out.println(" A thread is ending. ");
	}

}
