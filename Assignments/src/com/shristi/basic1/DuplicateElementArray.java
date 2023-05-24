package com.shristi.basic1;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,2,3};
		System.out.println("duplicates are :");
		for (int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if (array[i]==array[j]) 
						System.out.println(array[j]);
			}
		}
	}
}
