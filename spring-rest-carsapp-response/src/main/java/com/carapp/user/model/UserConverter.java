package com.carapp.user.model;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {
	public UserDTO toDto(User user) {
		UserDTO userDto=new UserDTO();
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setUserId(user.getUserId());
		return userDto;
	}
	
	public User toEntity(UsersDTO usersDto) {
		User user=new User();
		user.setFirstName(usersDto.getFirstName());
		user.setMiddleName(usersDto.getMiddleName());
		user.setLastName(usersDto.getLastName());
		user.setDateOfBirth(usersDto.getDateOfBirth());
		user.setCity(usersDto.getCity());
		user.setEmail(usersDto.getEmail());
		user.setFavouriteActor(usersDto.getFavouriteActor());
		return user;
	}
}
