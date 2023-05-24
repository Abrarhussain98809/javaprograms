package com.shristi.basic;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1");
		int a=sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();
		System.out.println("enter number 3");
		int c=sc.nextInt();
		
		String result=a>b&&a>c?a+" is greater":b>c?b+" is greater":c+" is greater";
		System.out.println(result);
	}

}
