package com.shristi.basic1;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,5,7,3,6,9};
		int sum=0;
		for (int i:array)
		{
			sum+=i;
		}
		System.out.println("Sum is :"+sum);
		float average=sum/array.length;
		System.out.println("Average :"+average);
	}

}
