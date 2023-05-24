package com.shristi.basic;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		for(int i=1;i<number;i++)
		{
			if (i%2!=1) {
				System.out.println(i);
		}
	}
	}
}
