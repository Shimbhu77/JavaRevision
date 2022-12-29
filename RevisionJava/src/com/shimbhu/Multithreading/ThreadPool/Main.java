package com.shimbhu.Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	
	public static void main(String[] args) {
		
		ThreadA[] threads = {
				new ThreadA("Ram"),
				new ThreadA("Alisha"),
				new ThreadA("Shayam"),
				new ThreadA("Alina"),
				new ThreadA("Vica"),
				new ThreadA("Jennit")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(ThreadA t : threads)
		{
			service.submit(t);
		}
		
		service.shutdown();
	}
}
