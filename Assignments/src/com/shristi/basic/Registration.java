package com.shristi.basic;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String names[]= {"abrar","hussain","affan","adil"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name :");
		String name=sc.next();
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equals(name)) {
				System.out.println("name is not unique");
				break;
			}
			else {
				System.out.println("you are registered");
			}
				
		}
		

	}

}
