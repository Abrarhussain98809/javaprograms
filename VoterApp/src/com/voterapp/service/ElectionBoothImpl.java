package com.voterapp.service;


import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFound;
import com.voterapp.exception.NoVoterIDExeption;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
	private String[] localities= {"banglore","kolar","mysore"};

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InvalidVoterException{
		if(!checkAge(age))
		{
			throw new UnderAgeException("Not eligible to vote");
		}
		if(!checkLocality(locality)) {
			throw new LocalityNotFound("locality is not found");
		}
		if(!checkVoterID(vid))
		{
			throw new NoVoterIDExeption("voter id is invalid");
		}
		return true;
	}
	//private boolean checkAge
	private boolean checkAge(int age)
	{
		if(age>18)
		{
			//System.out.println(" Age is eligible");
			return true;
		}
		return false;
		
	}
	private boolean checkLocality(String locality) {
		for(String validLocality:localities) {
			if(validLocality.equals(locality)) {
				return true;
			}
		}
		return false;
	}
	private boolean checkVoterID(int vid)
	{
		if(vid>=1000&&vid<=9999)
		{
			//System.out.println("valid voter id");
			return true;
		}
		return false;
	}
}

