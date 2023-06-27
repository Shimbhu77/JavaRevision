package com.CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		
        List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(70);
		
		// using collections.sort()
		System.out.println("before sorting : "+list);
		
		Collections.sort(list);
		
		System.out.println("after sorting : "+list);
		
		// natural order comparator
        List<Integer> list2 = new ArrayList<>();
		
		list2.add(10);
		list2.add(20);
		list2.add(90);
		list2.add(40);
		list2.add(70);
		
		System.out.println("before sorting : "+list2);
		
		list2.sort(Comparator.naturalOrder());
		
		System.out.println("natural order sorting : "+list2);
		
		
		//
	}
}
