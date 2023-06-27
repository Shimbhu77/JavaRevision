package com.CollectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableListMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// for loop
		System.out.println("Using for loop ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		// enhanced for loop
		System.out.println("Using enhanced for loop ");
		for(int val : list)
		{
			System.out.println(val);
		}
		
		// using iterator
		System.out.println("Using iterator ");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			int val = itr.next();
			
			System.out.println(val);
		}
		
		System.out.println(list);
	}
}
