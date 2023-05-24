package com.shristi.objbasics;

public class Student {
	String Name;
	String Department;
	public Student(String name, String department) {
		super();
		Name = name;
		Department = department;
	}
	void printDetails()
	{
		System.out.println("student details are....");
	}
	int sum=0;
	void getGrades(int marks[])
	{
		
		for(int j:marks) {
			sum=sum+j;
			
		}
		System.out.println(sum);
		if(sum>=200&&sum<300) {
			System.out.println("C grade");
			
		}
		else if(sum>=300&&sum<400) {
			System.out.println("B grade");
			
			}
		else if(sum>=400&&sum<500) {
			System.out.println("A grade");}
		else {
			System.out.println("wrong number");}
		
		
	}

}
