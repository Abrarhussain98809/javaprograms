package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFound;
import com.voterapp.exception.NoVoterIDExeption;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
	private String[] localities = { "banglore", "kolar", "mysore" };

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InvalidVoterException{
		if(checkAge(age) && checkLocality(locality) && checkVoterID(vid))
		{
		System.out.println("registered successfully");
		}
		return false;
	}
	private boolean checkAge(int age) throws UnderAgeException {
		if (age >= 18) {
			// System.out.println(" Age is eligible");
			return true;
		} else
			throw new UnderAgeException("under age");

	}

	private boolean checkLocality(String locality) throws LocalityNotFound{
		for (String validLocality : localities) {
			if (validLocality.equals(locality)) {
				return true;
			}
			else
				throw new LocalityNotFound("locality not found");
		}
		return false;
		
	}

	private boolean checkVoterID(int vid) throws NoVoterIDExeption{
		if (vid >= 1000 && vid <= 9999) {
			// System.out.println("valid voter id");
			return true;
		}
		else
			throw new NoVoterIDExeption("invalid");
	}
}
