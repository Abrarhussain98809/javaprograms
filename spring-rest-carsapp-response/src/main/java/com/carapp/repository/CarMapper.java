package com.carapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carapp.model.Car;

public class CarMapper implements RowMapper<Car>{

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
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
	}

	
}
