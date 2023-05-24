package com.shristi.absdemos;

public class Current extends Account {
	Double balance;
	Current (double balance)
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
