package com.carapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carapp.user.model.UsersDTO;
import com.carapp.user.service.IUserService;
import com.carapp.user.util.CsvHelper;

@SpringBootApplication
public class SpringRestCarsappResponseApplication implements CommandLineRunner {

	@Autowired
	private IUserService userService;
	@Autowired
	private CsvHelper csvHelper;
	public static void main(String[] args) {
		SpringApplication.run(SpringRestCarsappResponseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<UsersDTO> usersDtos=csvHelper.getUserDTOList("user.csv");
//		usersDtos.stream().forEach(usersDto->userService.addUser(usersDto));
		
	}

}
