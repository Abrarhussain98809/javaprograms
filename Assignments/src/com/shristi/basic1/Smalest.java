package com.shristi.basic1;

public class Smalest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {23,48,68,77,14};
		int min=array[0];
		for (int i=0;i<array.length;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		System.out.println("Smallest element is: "+min);
	}

}
