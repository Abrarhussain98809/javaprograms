package com.shristi.objbasics;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter student name: ");
		String name=sc.next();
		System.out.println("enter student department: ");
		String department=sc.next();
		
		int marks[]=new int[5];
		System.out.println("enter marks");
		for(int i=0;i<marks.length;i++)
		{
			
			marks[i]=sc.nextInt();
		}
		Student student=new Student(name,department);
		student.getGrades(marks);
		

	}

}
