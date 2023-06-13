package com.carapp.user.repository;

import java.util.List;

import com.carapp.model.Car;
import com.carapp.user.model.User;

public interface IUserRepository {
	User addUser(User user);
	void updateUser(String email,int password);
	void deleteUser(String userId);
	List<User> findAll();
	User findById(String userId);
	List<Car> findByEmailAndPassword(String email,int password);
}
