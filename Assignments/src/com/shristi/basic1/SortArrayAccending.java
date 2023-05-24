package com.shristi.basic1;

public class SortArrayAccending {

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
		System.out.println();
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		}

}
