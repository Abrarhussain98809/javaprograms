package com.shristi.basic1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=457;
		int reverse=0;
		while(number>0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;
		}
		System.out.println("reverse number is :"+reverse);
	}

}
