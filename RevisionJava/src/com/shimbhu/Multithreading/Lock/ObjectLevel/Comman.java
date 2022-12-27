package com.shimbhu.Multithreading.Lock.ObjectLevel;

public class Comman {

	public static  synchronized  void hello(String name)
	{
		System.out.println("Hello ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
	
	}
	
	public static  synchronized  void location(String city)
	{
		System.out.println(" My city is :  ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(city);
		
	}
	
	public static synchronized void count()
	{
		System.out.println("count method started .");
		for(int i=0;i<=6;i++)
		{
			System.out.println(" i value is : "+i);
		}
		System.out.println("count method ended .");
	}
	
	public  static synchronized void sum()
	{
		int sum=0;
		System.out.println("count method started .");
		for(int i=0;i<=20;i++)
		{
			sum=sum+i;
			System.out.println(" sum value is : "+sum);
		}
		System.out.println("count method ended . total sum is : " +sum);
	}
	
}
