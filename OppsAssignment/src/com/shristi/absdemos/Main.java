package com.shristi.absdemos;

import java.util.Scanner;

import com.shristi.inherdemos.Current;
import com.shristi.inherdemos.Savings;

public class Main {

	public static void main(String[] args) {
		Savings saving=new Savings(500);
		Current current=new Current(600);
		System.out.println("enter 1 to deposit from current");
		System.out.println("enter 2 to withdraw from current");
		System.out.println("enter 3 to deposit from saving");
		System.out.println("enter 4 to withdraw from saving");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter amount to deposit :");
				int money=sc.nextInt();
				current.deposit(money);
				break;
		case 2:System.out.println("enter amount to withdraw :");
				int money1=sc.nextInt();
				current.withDraw(money1);
				break;
		case 3:System.out.println("enter amount to deposit :");
				int money2=sc.nextInt();
				saving.deposit(money2);
				break;
		case 4:System.out.println("enter amount to withdraw :");
				int money3=sc.nextInt();
				saving.withDraw(money3);
				break;
		default: 
				System.out.println("invalid choice");
		}

	}

}
