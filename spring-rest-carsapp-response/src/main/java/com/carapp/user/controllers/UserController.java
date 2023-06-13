package com.carapp.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapp.model.Car;
import com.carapp.user.model.User;
import com.carapp.user.model.UserConverter;
import com.carapp.user.model.UserDTO;
import com.carapp.user.service.IUserService;

@RestController
@RequestMapping("/user-api")
public class UserController {

	
	private IUserService userService;
	@Autowired
	UserConverter userConverter;
	
	
	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping("/users")
	ResponseEntity<UserDTO> addUser(@RequestBody User user){
		User userdetails=userService.addUser(user);
		UserDTO userDto=userConverter.toDto(userdetails);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "adding one user");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(userDto);
	}
	
	@PatchMapping("/users/email/{email}/password/{password}")
	ResponseEntity<Void> updateUser(@PathVariable("email") String email,@PathVariable("password") int password){
		userService.updateUser(email, password);
		return ResponseEntity.accepted().build();
	}
	
	@DeleteMapping("/users/userId/{userId}")
	ResponseEntity<Void> deleteUser(@PathVariable("userId") String userId){
		userService.deleteUser(userId);
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("/users")
	ResponseEntity<List<User>> getAll(){
		List<User> users=userService.getAll();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning all users");
		httpHeaders.add("desc", "users from database");
		ResponseEntity<List<User>> responseEntity=
				new ResponseEntity<List<User>>(users,httpHeaders,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/users/userId/{userId}")
	ResponseEntity<User> getByUserId(@PathVariable("userId") String userId){
		User user=userService.getById(userId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning one user by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(user);
		
	}
	@GetMapping("/users/email/{email}/password/{password}")
	ResponseEntity<List<Car>> getByEmailAndPassword(@PathVariable("email") String email,@PathVariable("password") int password){
		List<Car> users=userService.getByEmailAndPassword(email, password);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning user by email and password");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(users);
	}
	
	
}
