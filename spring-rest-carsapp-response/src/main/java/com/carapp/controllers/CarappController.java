package com.carapp.controllers;

import java.util.List;

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
import com.carapp.service.ICarService;

@RestController
@RequestMapping("/car-api")
public class CarappController {
	
	private ICarService carService;

	public CarappController(ICarService carService) {
		super();
		this.carService = carService;
	}
	@PostMapping("/cars")
	ResponseEntity<Void> addCar(@RequestBody Car car) {
		carService.addCar(car);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "adding one car");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		
	}
	@PatchMapping("/cars/carId/{carId}/price/{price}")
	ResponseEntity<Void> updateCar(int carId,double price) {
		carService.updateCar(carId, price);
		return ResponseEntity.accepted().build();
	}
	@DeleteMapping("/cars/carId/{carId}")
	ResponseEntity<Void> deleteCar(@PathVariable("carId") int carId) {
		carService.deleteCar(carId);
		return ResponseEntity.accepted().build();
	}
	@GetMapping("/cars")
	ResponseEntity<List<Car>> getAll(){
		List<Car> cars=carService.getAll();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning all cars");
		httpHeaders.add("desc", "cars from database");
		ResponseEntity<List<Car>> responseEntity=
				new ResponseEntity<List<Car>>(cars,httpHeaders,HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/cars/carId/{carId}")
	ResponseEntity<Car> getById(@PathVariable("carId") int carId) {
		Car car=carService.getById(carId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning one car by id");
		
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(car);
		
	}
	@GetMapping("/cars/brand/{brand}")
	ResponseEntity<List<Car>> getByBrand(@PathVariable("brand")  String brand){
		List<Car> cars=carService.getByBrand(brand);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by brand");
		return ResponseEntity.ok(cars);
		
	}
	@GetMapping("/cars/price/{price}")
	ResponseEntity<List<Car>> getByPriceLessThan(@PathVariable("price") double price){
		List<Car> cars=carService.getByPriceLessThan(price);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by price");
		return ResponseEntity.ok(cars);
		
	}
	@GetMapping("/cars/color/{color}")
	ResponseEntity<List<Car>> getByColor(@PathVariable("color") String color){
		List<Car> cars=carService.getByColor(color);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by color");
		return ResponseEntity.ok(cars);
		
	}
	@GetMapping("/cars/fuelType/{fuelType}")
	ResponseEntity<List<Car>> getByFuelType(@PathVariable("fuelType") String fuelType){
		List<Car> cars=carService.getByFuelType(fuelType);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by fuelType");
		return ResponseEntity.ok(cars);
		
	}
	@GetMapping("/cars/year/{year}")
	ResponseEntity<List<Car>> getByYear(@PathVariable("year") String year){
		List<Car> cars=carService.getByYear(year);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by year");
		return ResponseEntity.ok(cars);
		
	}
	@GetMapping("/books/brand/{brand}/model/{model}")
	ResponseEntity<List<Car>> getByBrandAndModel(@PathVariable("brand") String brand,@PathVariable("model") String model){
		List<Car> cars=carService.getByBrandAndModel(brand, model);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning by brand and model");
		return ResponseEntity.ok(cars);
	}
}
