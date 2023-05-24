package com.shristi.basic1;

public class ArmStrong {

	public static void main(String[] args) {
		int number =2;
		int count=0;
		int temp=number;
		int temp2=number;
		int sum=0;
		while(number>0)
		{
			count++;
			number/=10;
		}
		while(temp>0)
		{
			int remainder =temp%10;int product=1;
			for (int i=1;i<=count;i++)
			{
				product =product*remainder;
			}
			sum=sum+product;
			temp/=10;
		}
		if(sum==temp2) 
			System.out.println("number is armstrong");
		else
			System.out.println("number is not a armstrong");

	}

}
