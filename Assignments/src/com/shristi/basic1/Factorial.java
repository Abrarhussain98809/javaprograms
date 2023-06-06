package com.shristi.basic1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=4;
		int factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial*=i;
		}
		System.out.println("factorial of a number is :"+factorial);
	}

}
