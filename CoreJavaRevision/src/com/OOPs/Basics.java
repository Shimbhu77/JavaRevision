package com.OOPs;

public class Basics {
	
	static int age;
	
	String name;
	
	boolean isMarried;
	
	public Basics(String name,boolean isMarried) {
		
		this.name=name;
		this.isMarried=isMarried;;
		
	}

	public static void main(String[] args) {
		
		age=21;
		
		System.out.println("my age is this : "+age);
		
		Basics bs = new Basics("Shimbhu Kumawat",false);
		Basics bs1 = new Basics("Payal Kumawat",false);
		
		System.out.println("my name is this : "+bs.name);
		
		System.out.println("are you married : "+bs.isMarried);
		
		System.out.println("my name is this : "+bs1.name);
		
		System.out.println("are you married : "+bs1.isMarried);
		
		// Wrapper Class 
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		
		System.out.println("min value : "+min+" max value : "+max);
		System.out.println("min value of Byte  : "+minByte+" max value of Byte : "+maxByte);
		System.out.println("min value of Short  : "+minShort+" max value of Short : "+maxShort);
		
		// Type Casting 
		
		byte b1 = 10;
		
		int i1 = b1;
		
		byte b2 = (byte) i1;
		
		System.out.println("byte is : "+b1+" integer is : "+i1+" again byte is : "+b2);
		
		
		
	}
}
