package com.shristi.objbasics;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ");
		String name=sc.next();
		System.out.println("Enter Designation ");
		String designation=sc.next();
		double bonus1=20;
		double bonus2=30;
		double bonus3=50;
		Employee employee=new Employee(name,designation);
		if(designation.equals("programmer"))
		{
			employee.calcBonus(bonus1);
		}
		else if(designation.equals("manager"))
		{
			employee.calcBonus(bonus1, bonus2);
		}
		else if(designation.equals("director"))
		{
			employee.calcBonus(bonus1, bonus2, bonus3);
		}
		else
		{
			System.out.println("No match of designation");
		}
	}

}
