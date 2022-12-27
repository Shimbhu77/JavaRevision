package com.shimbhu.Interface;

public class Demo implements Human,Robot {

	
	
	@Override
	public void autoMate() {
		System.out.println(" machine not doing any mistake ");
		
	}

	@Override
	public String walk() {
		
		System.out.println("human is walking.");
		
		return " hello ";
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		d.autoMate();
		d.walk();
		Human.eat();
		Robot.eat();
	}

}
