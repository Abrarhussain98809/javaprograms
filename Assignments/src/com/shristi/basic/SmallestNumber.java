package com.shristi.basic;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1");
		int a=sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();
		System.out.println("enter number 3");
		int c=sc.nextInt();
		
		String result=a<b&&a<c?a+" is smallest":b<c?b+" is smallest":c+" is smalest";
		System.out.println(result);
	}

}
