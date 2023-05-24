package com.userapp.service;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class UserMain {
	

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println();
		
		IValidationServiceImpl validation=new IValidationServiceImpl();
		try {
			System.out.println(validation.validateUserName(name));
		} catch (NameExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter password");
		String password=sc.next();
		try {
			System.out.println(validation.validatePassword(password));
		} catch (TooShortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TooLongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
