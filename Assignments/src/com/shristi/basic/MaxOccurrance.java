package com.shristi.basic;

import java.util.Scanner;

public class MaxOccurrance {

	public static void main(String[] args) {
		
		char maxChar=' ';
		int max = -1;
		int charFreq[]=new int[500];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String maxOccur=sc.nextLine();
		for (int i=0;i<maxOccur.length();i++)
		{
			charFreq[maxOccur.charAt(i)]++;
		}
		for(int i=0;i<maxOccur.length();i++)
		{
			char ch=maxOccur.charAt(i);
			
			
			if(max<charFreq[ch])
			{
				max=charFreq[ch];
				maxChar=ch;
			}
		}
		System.out.println(maxChar);
	}

}
