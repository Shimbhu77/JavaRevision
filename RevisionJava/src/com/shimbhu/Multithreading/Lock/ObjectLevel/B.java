package com.shimbhu.Multithreading.Lock.ObjectLevel;

public class B extends Thread{
	
	String name;
	String city;
	Comman c;
	
	
	public B(String n,String city,Comman c) {
		this.name=n;
		this.city=city;
		this.c=c;
	}
	
	@Override
	public void run() {
		
		c.hello(name);
		c.count();
		c.location(city);
		c.sum();
		
	}

}
