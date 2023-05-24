package com.shristi.absdemos;

public class Savings extends Account{
	Double balance;
	Savings(double balance)
	{
		this.balance=balance;
	}
	double amount1;
	@Override
	void withdraw(double amount) {
		
		System.out.println("balance is :"+balance);
		amount1=balance-amount;
		System.out.println("After withdrawing money "+amount1);
	}

	@Override
	void deposit(double amount) {
		System.out.println("balance is :"+balance);
		amount1=balance+amount;
		System.out.println("After depositing money "+amount1);
		
	}
	
}
