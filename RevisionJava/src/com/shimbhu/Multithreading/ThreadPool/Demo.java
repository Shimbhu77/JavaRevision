package com.shimbhu.Multithreading.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable[] myc = {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60)	
		};
		
		
	    ExecutorService service = Executors.newFixedThreadPool(4);
	    
	    for(MyCallable my : myc)
	    {
	    	 Future f = service.submit(my);
	    	 System.out.println(f.get());
	    	 
	    }
	    
	    service.shutdown();
		
	}
}
