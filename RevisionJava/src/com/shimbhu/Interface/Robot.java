package com.shimbhu.Interface;

public interface Robot {
   
	public void autoMate();
	public String walk();
	
	static void eat()
	{
		System.out.println("Robot is charging.");
	}
}
