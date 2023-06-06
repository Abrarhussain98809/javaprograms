package com.shristi.basic;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		System.out.println("enter the values :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();		
		}
		int sum=0;
		for (int j:array)
		{
			sum=sum+j;
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("Sum is :"+sum);
		System.out.println("Average is :"+sum/array.length);
		
		
	}
	

}
