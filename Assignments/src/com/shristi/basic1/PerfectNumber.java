package com.shristi.basic1;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=38;
		int sum=0;
		for (int i=0;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum==number) {
			System.out.println(number+" is a perfect number");
		}
		else
		{
			System.out.println(number+" is not a perfect number");
		}
	}

}
