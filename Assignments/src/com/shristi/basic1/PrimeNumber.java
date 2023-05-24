package com.shristi.basic1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=17;
		int count=0;
		for (int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}

}
