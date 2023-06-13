package com.carapp.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carapp.exeptions.UserNotFoundException;
import com.carapp.model.Car;
import com.carapp.service.ICarService;
import com.carapp.user.model.User;
import com.carapp.user.service.IUserService;
@Repository
public class UserRepositoryImpl implements IUserRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ICarService carService;


	@Override
	public User addUser(User user) {
		String sql=Queries.INSERTQUERY;
		Object[] userArray= {user.getUserId(),user.getFirstName(),user.getMiddleName(),user.getLastName(),user.getDateOfBirth(),user.getEmail(),user.getCity(),user.getPassword(),user.getFavouriteActor()};
		jdbcTemplate.update(sql,userArray);	
		return user;
	}

	@Override
	public void updateUser(String email, int password) {
		String sql = Queries.UPDATEQUERY;
		jdbcTemplate.update(sql,password ,email );

	}

	@Override
	public void deleteUser(String userId) {
		String sql = Queries.DELETEQUERY;
		jdbcTemplate.update(sql,userId);  

	}

	@Override
	public List<User> findAll() {
		String sql=Queries.GETALLQUERY;
		return jdbcTemplate.query(sql,new UserMapper());
	}

	@Override
	public User findById(String userId) {
		try {
			User user = jdbcTemplate.queryForObject(Queries.GETBYIDQUERY, new UserMapper(), userId);
			return user;

		} catch (Exception e) {

			return null;
		}
	}

	@Override
	public List<Car> findByEmailAndPassword(String email, int password) {
		User user=jdbcTemplate.queryForObject(Queries.GETBYEMAILANDPASSWORD, new UserMapper(),email,password);
		User nuser =Optional.of(user)
				.orElseThrow(()->new UserNotFoundException("no user with this email and password"));
		return carService.getAll();
	}

	
}
