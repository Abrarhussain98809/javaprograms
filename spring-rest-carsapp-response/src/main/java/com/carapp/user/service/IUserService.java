package com.carapp.user.service;

import java.util.List;

import com.carapp.exeptions.UserNotFoundException;
import com.carapp.model.Car;
import com.carapp.user.model.User;
import com.carapp.user.model.UsersDTO;


public interface IUserService {

	User addUser(User user);
	User addUser(UsersDTO usersDto);
	void updateUser(String email,int password);
	void deleteUser(String userId);
	List<User> getAll();
	User getById(String userId);
	List<Car> getByEmailAndPassword(String email,int password) throws com.carapp.user.exceptions.UserNotFoundException;
}
