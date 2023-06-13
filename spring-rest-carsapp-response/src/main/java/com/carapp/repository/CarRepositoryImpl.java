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
		String sql=Queries.INSERTQUERY;
		Object[] carArray= {car.getcarId(),car.getBrand(),car.getModel(),car.getYear(),car.getColor(),car.getMileage(),car.getPrice() ,car.getBodyType(),car.getFuelType(),car.getTransmission(),car.getKmsRun()};
		jdbcTemplate.update(sql,carArray);
	}

	@Override
	public void updateCar(int carId, double price) {
		String sql=Queries.UPDATEQUERY;
		jdbcTemplate.update(sql,price,carId);
		
	}

	@Override
	public void deleteCar(int carId) {
		String sql=Queries.DELETEQUERY;
		jdbcTemplate.update(sql,carId);
		
	}

	@Override
	public List<Car> findAll() {
		String sql=Queries.FINDALL;
		return jdbcTemplate.query(sql, new CarMapper());
	}

	@Override
	public Optional<Car> findById(int carId) {
		String sql=Queries.FINDBYID;
		Car ncar=null;
		try {
			ncar=jdbcTemplate.queryForObject(sql, (rs,rowNum)->{
				Car car=new Car();
				car.setcarId(rs.getInt("carId"));
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
		String sql=Queries.FINDBYBRAND;
		return jdbcTemplate.query(sql,new CarMapper(),brand);
	}

	@Override
	public List<Car> findByPriceLessThan(double price) {
		String sql=Queries.FINDBYPRICELESSTHAN;
		return jdbcTemplate.query(sql,new CarMapper(),price);
	}

	@Override
	public List<Car> findByColor(String color) {
		String sql=Queries.FINDBYCOLOR;
		return jdbcTemplate.query(sql,new CarMapper(),color);
	}

	@Override
	public List<Car> findByFuelType(String fuelType) {
		String sql=Queries.FINDBYFUELTYPE;
		return jdbcTemplate.query(sql,new CarMapper(),fuelType);
	}

	@Override
	public List<Car> findByYear(String year) {
		String sql=Queries.FINDBYYEAR;
		return jdbcTemplate.query(sql,new CarMapper(),year);
	}

	@Override
	public List<Car> findByBrandAndModel(String brand, String model) {
		String sql=Queries.FINDBYBRANDANDMODEL;
		return jdbcTemplate.query(sql,new CarMapper(),brand,model);
	}

}
