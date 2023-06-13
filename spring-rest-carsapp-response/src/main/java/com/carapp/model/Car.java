package com.carapp.model;

public class Car {
	private Integer carId;
	private String brand;
	private String model;
	private double year;
	private String color;
	private String mileage;
	private double price;
	private String bodyType;
	private String fuelType;
	private String transmission;
	private double kmsRun;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer CarId, String brand, String model, double year, String color, String mileage, double price,
			String bodyType, String fuelType, String transmission, double kmsRun) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
		this.price = price;
		this.bodyType = bodyType;
		this.fuelType = fuelType;
		this.transmission = transmission;
		this.kmsRun = kmsRun;
	}
	public Integer getcarId() {
		return carId;
	}
	public void setcarId(Integer carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public double getKmsRun() {
		return kmsRun;
	}
	public void setKmsRun(double kmsRun) {
		this.kmsRun = kmsRun;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", mileage=" + mileage + ", price=" + price + ", bodyType=" + bodyType + ", fuelType=" + fuelType
				+ ", transmission=" + transmission + ", kmsRun=" + kmsRun + "]";
	}
	

}
