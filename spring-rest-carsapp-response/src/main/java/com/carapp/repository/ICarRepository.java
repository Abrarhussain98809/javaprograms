package com.carapp.repository;

import java.util.List;
import java.util.Optional;


import com.carapp.model.Car;

public interface ICarRepository {
	void addCar(Car car);
	void updateCar(int carId,double price);
	void deleteCar(int carId);
	List<Car> findAll();
	Optional<Car> findById(int carId);
	List<Car> findByBrand(String brand);
	List<Car> findByPriceLessThan(double price);
	List<Car> findByColor(String color);
	List<Car> findByFuelType(String fuelType);
	List<Car> findByYear(String year);
	List<Car> findByBrandAndModel(String brand,String model);
}
