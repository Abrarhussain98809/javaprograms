package com.carapp.service;

import java.util.List;

import com.carapp.exeptions.CarNotFoundException;
import com.carapp.model.Car;

public interface ICarService {
	
	void addCar(Car car);
	void updateCar(int carId,double price);
	void deleteCar(int carId);
	List<Car> getAll();
	Car getById(int carId)throws CarNotFoundException;
	List<Car> getByBrand(String brand)throws CarNotFoundException;
	List<Car> getByPriceLessThan(double price)throws CarNotFoundException;
	List<Car> getByColor(String color)throws CarNotFoundException;
	List<Car> getByFuelType(String fuelType)throws CarNotFoundException;
	List<Car> getByYear(String year)throws CarNotFoundException;
	List<Car> getByBrandAndModel(String brand,String model)throws CarNotFoundException;
}
