package com.shristi.basic1;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {23,45,68,28,67};
		int max=array[0];
		for (int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Greatest element is: "+max);
	}

}
