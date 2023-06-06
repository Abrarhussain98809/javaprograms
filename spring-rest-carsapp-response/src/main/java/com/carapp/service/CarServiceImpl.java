package com.carapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.exeptions.CarNotFoundException;
import com.carapp.model.Car;
import com.carapp.repository.ICarRepository;
@Service
public class CarServiceImpl implements ICarService{

	@Autowired
	ICarRepository carRepository;
	@Override
	public void addCar(Car car) {
		carRepository.addCar(car);
		
	}

	@Override
	public void updateCar(int carId, double price) {
		carRepository.updateCar(carId, price);
		
	}

	@Override
	public void deleteCar(int carId) {
		carRepository.deleteCar(carId);
		
	}

	@Override
	public List<Car> getAll() {
		
		return carRepository.findAll();
	}

	@Override
	public Car getById(int carId) throws CarNotFoundException {
		
		return carRepository.findById(carId)
				.orElseThrow(()->new CarNotFoundException("invalid id"));
	}

	@Override
	public List<Car> getByBrand(String brand) throws CarNotFoundException {
		List<Car> cars=carRepository.findByBrand(brand);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

	@Override
	public List<Car> getByPriceLessThan(double price) throws CarNotFoundException {
		List<Car> cars=carRepository.findByPriceLessThan(price);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

	@Override
	public List<Car> getByColor(String color) throws CarNotFoundException {
		List<Car> cars=carRepository.findByColor(color);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

	@Override
	public List<Car> getByFuelType(String fuelType) throws CarNotFoundException {
		List<Car> cars=carRepository.findByFuelType(fuelType);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

	@Override
	public List<Car> getByYear(String year) throws CarNotFoundException {
		List<Car> cars=carRepository.findByYear(year);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

	@Override
	public List<Car> getByBrandAndModel(String brand, String model) throws CarNotFoundException {
		List<Car> cars=carRepository.findByBrandAndModel(brand, model);
		if(cars.isEmpty()) {
			throw new CarNotFoundException("no car found");
		}
		return cars;
	}

}
