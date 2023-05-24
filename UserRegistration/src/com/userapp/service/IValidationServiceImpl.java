package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;

import com.userapp.exception.TooShortException;

public class IValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		String[] usernames = { "abrar", "semeio" };

		for (String user : usernames) {
			if (user.equals(username))
				throw new NameExistsException("name is exists");

		}

		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if (password.length() <=6) {
			throw new TooShortException("password is short");
		} else if (password.length() >= 15) {
			throw new TooLongException("password is long");

		}
		return true;

	}
}
