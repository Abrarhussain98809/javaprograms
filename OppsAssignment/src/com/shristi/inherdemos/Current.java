package com.shristi.inherdemos;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	double amount1;
	@Override
	public
	void withDraw(double amount) {
		System.out.println("balance is :"+balance);
		amount1=balance-amount;
		System.out.println("After withdrawing money "+amount1);
	}
	@Override
	public
	void deposit(double amount) {
		System.out.println("balance is :"+balance);
		amount1=balance+amount;
		System.out.println("After depositing "+amount +" money is "+amount1);
	}
	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return amount1;
	}
	
}
