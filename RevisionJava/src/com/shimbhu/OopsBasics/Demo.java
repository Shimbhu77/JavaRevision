package com.shimbhu.OopsBasics;

public class Demo {

	// instance variable 
	 int x =20;
	 
	 // this value is changed for other object also 
	 static int s=77;
	 
	 int z;
	 static int yx;
	 
	public static void main(String[] args) {
		
		int a=show();
		
		Demo demo = new Demo();
		System.out.println(demo.x+" static s : "+demo.s);
		demo.x=10;
		demo.s=7;
		System.out.println(demo.x+" static s : "+demo.s);
		
		Demo demo2 = new Demo();
		
		// not changed
		System.out.println(demo2.x);
		// value is changed
		System.out.println(demo2.s);
		
		//System.out.println(s);
		
		System.out.println("a default value is : "+a);
		System.out.println("static yx default value is "+yx);
		System.out.println("z default value is "+new Demo().z);
		
		// className.variabe or method
		System.out.println(Demo.yx);
		
		
		
	}
	static int show()
	{
		int b=10;
		return b;
	}
}
