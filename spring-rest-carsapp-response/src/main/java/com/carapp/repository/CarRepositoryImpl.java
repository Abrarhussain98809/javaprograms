package com.carapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.carapp.exeptions.CarNotFoundException;
import com.carapp.model.Car;
@Repository
public class CarRepositoryImpl implements ICarRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addCar(Car car) {
		String sql="insert into car(id,brand,model,year,color,mileage,price,bodyType,fuelType,transmission,kmsRun) values(?,?,?,?,?,?,?,?,?,?,?)";
		Object[] carArray= {car.getId(),car.getBrand(),car.getModel(),car.getYear(),car.getColor(),car.getMileage(),car.getPrice() ,car.getBodyType(),car.getFuelType(),car.getTransmission(),car.getKmsRun()};
		jdbcTemplate.update(sql,carArray);
	}

	@Override
	public void updateCar(int carId, double price) {
		String sql="update car set price=? where carId=?";
		jdbcTemplate.update(sql,price,carId);
		
	}

	@Override
	public void deleteCar(int carId) {
		String sql="delete from car where carId=?";
		jdbcTemplate.update(sql,carId);
		
	}

	@Override
	public List<Car> findAll() {
		String sql="select * from car";
		return jdbcTemplate.query(sql, new CarMapper());
	}

	@Override
	public Optional<Car> findById(int carId) {
		String sql="select * from car where carId=?";
		Car ncar=null;
		try {
			ncar=jdbcTemplate.queryForObject(sql, (rs,rowNum)->{
				Car car=new Car();
				car.setId(rs.getInt("carId"));
				car.setBrand(rs.getString("brand"));
				car.setModel(rs.getString("model"));
				car.setYear(rs.getDouble("year"));
				car.setColor(rs.getString("color"));
				car.setMileage(rs.getString("mileage"));
				car.setPrice(rs.getDouble("price"));
				car.setBodyType(rs.getString("bodyType"));
				car.setFuelType(rs.getString("fuelType"));
				car.setTransmission(rs.getString("transmission"));
				car.setKmsRun(rs.getDouble("kmsRun"));
				
				return car;
			}, carId);
			}catch(DataAccessException e) {
				throw new CarNotFoundException("invalid id");
			}
			Optional<Car> optCar=Optional.of(ncar);
			return optCar;
		
	}

	@Override
	public List<Car> findByBrand(String brand) {
		String sql="select * from car where brand=?";
		return jdbcTemplate.query(sql,new CarMapper(),brand);
	}

	@Override
	public List<Car> findByPriceLessThan(double price) {
		String sql="select * from car where price < ?";
		return jdbcTemplate.query(sql,new CarMapper(),price);
	}

	@Override
	public List<Car> findByColor(String color) {
		String sql="select * from car where color=?";
		return jdbcTemplate.query(sql,new CarMapper(),color);
	}

	@Override
	public List<Car> findByFuelType(String fuelType) {
		String sql="select * from car where fuelType=?";
		return jdbcTemplate.query(sql,new CarMapper(),fuelType);
	}

	@Override
	public List<Car> findByYear(String year) {
		String sql="select * from car where year=?";
		return jdbcTemplate.query(sql,new CarMapper(),year);
	}

	@Override
	public List<Car> findByBrandAndModel(String brand, String model) {
		String sql="select * from car where brand=? and model=?";
		return jdbcTemplate.query(sql,new CarMapper(),brand,model);
	}

}
