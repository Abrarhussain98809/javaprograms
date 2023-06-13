package com.carapp.user.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.exeptions.UserNotFoundException;
import com.carapp.model.Car;
import com.carapp.user.model.User;
import com.carapp.user.model.UserConverter;
import com.carapp.user.model.UsersDTO;
import com.carapp.user.repository.IUserRepository;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	@Autowired
	private UserConverter userConverter;
	
	@Override
	public User addUser(User user) {
		String userId=generateUserId(user);
		User userById=getById(userId);
		if(userById==null) {
			int password=generatePassword();
			user.setUserId(userId);
			user.setPassword(password);
			userRepository.addUser(user);
			return user;
		}
		else {
			userId=generateUserIdAgain(user);
			int password=generatePassword();
			user.setUserId(userId);
			user.setPassword(password);
			userRepository.addUser(user);
			return user;
		}
		
	}
	
	static int i=0;
	public String generateUserId(User user) {
	  String firstName=user.getFirstName();
	  String lastName=user.getLastName();
	  String middleName=user.getMiddleName();
	  if(middleName==null) {
		  middleName="mn";
	  }
	  if(i==9) {
		  i=0;
	  }
	  String city=user.getCity();
	  String userId=(city.substring(0, 2).toUpperCase()+firstName.charAt(0)+middleName.charAt(0)+ lastName.charAt(0)+(i++));
	  return userId;
  }
	public String generateUserIdAgain(User user) {
		String firstName=user.getFirstName();
		String lastName=user.getLastName();
		String middleName=user.getMiddleName();
		if(middleName==null) {
			  middleName="mn";
		  }
		  if(i==9) {
			  i=0;
		  }
		String city=user.getCity();
		String userId=(city.substring(0, 2).toUpperCase()+firstName.substring(0, 2).toUpperCase()+middleName.charAt(0)+ lastName.charAt(0)+(i++));
		return userId;
	}
	public int generatePassword() {
		int password=0;
		Random random=new Random();
		for (int i=1;i<=4;i++) {
			int j =random.nextInt(5);
			password=password*10+j;
		}
		return password;
	}
	@Override
	public void updateUser(String email, int password) {
		userRepository.updateUser(email, password);
		
	}
	@Override
	public void deleteUser(String userId) {
		userRepository.deleteUser(userId);
		
	}
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	
	}
	@Override
	public User getById(String userId) {
		User user=userRepository.findById(userId);
		return user;
	}
	@Override
	public List<Car> getByEmailAndPassword(String email, int password) throws com.carapp.user.exceptions.UserNotFoundException {
		List<Car> cars=userRepository.findByEmailAndPassword(email, password);
		if(cars.isEmpty()) {
			throw new com.carapp.user.exceptions.UserNotFoundException("user not found");
		}
		return cars;
	}
	
	@Override
	public User addUser(UsersDTO usersDto) {
		User user=userConverter.toEntity(usersDto);
		String userId=generateUserId(user);
		User userById=getById(userId);
		if(userById==null) {
			int password=generatePassword();
			user.setUserId(userId);
			user.setPassword(password);
			userRepository.addUser(user);
			return user;
		}
		else {
			userId=generateUserIdAgain(user);
			int password=generatePassword();
			user.setUserId(userId);
			user.setPassword(password);
			userRepository.addUser(user);
			return user;
		}
		
	}


}
