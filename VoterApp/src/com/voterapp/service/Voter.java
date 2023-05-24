package com.voterapp.service;

import java.util.Scanner;

import com.voterapp.exception.InvalidVoterException;


public class Voter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		System.out.println("enter locality");
		String locality=sc.next();
		System.out.println("enter voterid");
		int voterId=sc.nextInt();
		
		ElectionBooth electionbooth=new ElectionBoothImpl();
		try {
		
			boolean isEligible=electionbooth.checkEligibility(age, locality, voterId);
			if(isEligible) {
			System.out.println("voter is eligible to vote!");}
		}
		catch(InvalidVoterException e){
			//System.out.println("invalid voter Exception");
			e.printStackTrace();
		}
		
		
	}

}
