package com.shristi.basic;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array :");
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		double arr2[]=new double[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			arr2[i]=Math.sqrt(arr[i]);
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("square Root of "+arr[i]+"is "+arr2[i]);
		}

	}

}
