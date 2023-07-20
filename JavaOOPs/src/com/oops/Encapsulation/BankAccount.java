package com.oops.Encapsulation;

public class BankAccount {

	private String name;
	private String accountNo;
	private int balance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String name, String accountNo, int balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void depositMoney(int amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
			
			System.out.println(amount+" deposited successfully.");
		}
		else
		{
			System.out.println("Enter a valid amount.");
		}
		
		
	}
	public void withdrawMoney(int amount)
	{
		if(amount>0 && this.balance>0)
		{
			this.balance-=amount;
			System.out.println(amount+" withdrawed successfully.");
		}
		else
		{
			System.out.println("insufficient balance.");
		}
		
		
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	
}
