package com.oops.Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.setName("Ram");
		ba.setBalance(0);
		ba.setAccountNo("1234567890");
		
		System.out.println(ba);
		
		ba.depositMoney(1000);
		ba.withdrawMoney(500);
		System.out.println(ba.getBalance());
		
		
		
	}
}
