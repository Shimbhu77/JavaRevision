package com.OOPs.Abstraction;

public class IntrClass implements MyInterface{

	@Override
	public void detais() {
	
		System.out.println("I am IntrClass. which Implements My Interface.");	
	}
	
	@Override
	public void intrDetails() {
		
//		MyInterface.super.intrDetails();
		System.out.println(" intrdetails is overrided in intrclass.");
	}
	
	public static void main(String[] args) {
		
		IntrClass intr = new IntrClass();
		
		intr.detais();
		intr.intrDetails();
		MyInterface.intrDetails2();
	}

}
