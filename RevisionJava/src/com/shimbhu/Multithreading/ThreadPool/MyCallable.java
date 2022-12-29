package com.shimbhu.Multithreading.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

	
	int num;
	
	public MyCallable(int num) {
		this.num=num;
	}
	
	@Override
	public Object call() throws Exception {
	
		int sum=0;
		
		System.out.println(Thread.currentThread().getName()+" .. is responsible to find the sum of first "+num+" numbers");
		
		
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		
		return sum;
		
		
	}

}
