package com.shristi.objbasics;

public class Employee {

	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	double calcBonus(double basicAllowance)
	{
		System.out.println("you are eligible for basic allowance "+basicAllowance);
		return basicAllowance;
	}
	double calcBonus(double basicAllowance,double carAllowance)
	{
		System.out.println("you are eligible for basic and car allowance "+(basicAllowance+carAllowance));
		return basicAllowance+carAllowance;
	}
	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
	{
		System.out.println("you are eligible for basic,car,house allowance "+ (basicAllowance+carAllowance+houseAllowance));
		return basicAllowance+carAllowance+houseAllowance;
	}
}
