package com.shimbhu.String;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
	   Byte[] arr  = {100,101,102};
	   System.out.println(Arrays.toString(arr));
	   
	 //   String str  = new String(arr); // Error 
	   
	   char[] chars = {'S','h','i','m','b','h','u'};
	   
	   String str = new String(chars);
	   System.out.println(str);
	   
		long[] longs= new long[3];
		longs[0]=1;
		longs[0]=2;
		longs[0]=3;
		
		System.out.println(Arrays.toString(longs));
	}
}
