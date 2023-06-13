package com.carapp.buying.model;

public class OrderDTO {

	private String brand;
	private String model;
	private String color;
	private double price;
	private String bodyType;
	private int orderId;
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(String brand, String model, String color, double price, String bodyType, int orderId) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.bodyType = bodyType;
		this.orderId = orderId;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderDTO [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", bodyType="
				+ bodyType + ", orderId=" + orderId + "]";
	}
}
