package com.shimbhu.Multithreading.Lock;

public class B extends Thread{
	
	String name;
	Comman c;
	
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public B(String n,Comman c) {
		this.name=n;
		this.c=c;
	}
	
	@Override
	public void run() {
//		System.out.println(" B thread is started. ");
		
		c.hello(name);
		
//		System.out.println(" B thread is ending. ");
	}

}
