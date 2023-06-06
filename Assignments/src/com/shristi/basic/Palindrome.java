package com.shristi.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int number=sc.nextInt();
		int number1=number;
		int reverse=0;
		while(number>0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;
		}
		if(reverse==number1)
			System.out.println("number is palindrome");
		else
			System.out.println("not a palindrome");
	}

}
