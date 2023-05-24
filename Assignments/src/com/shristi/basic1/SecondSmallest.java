package com.shristi.basic1;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,8,6,7,3,2};
		for (int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i;j++)
			{
				if(array[j-1]>array[j])
				{
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("the second smallest is :"+array[1]);

	}

}
