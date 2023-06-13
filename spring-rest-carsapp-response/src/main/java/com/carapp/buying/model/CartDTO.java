package com.carapp.buying.model;

public class CartDTO {

	private String brand;
	private String model;
	private String color;
	private double price;
	private String bodyType;
	private int cartId;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(String brand, String model, String color, double price, String bodyType, int cartId) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.bodyType = bodyType;
		this.cartId = cartId;
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
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	@Override
	public String toString() {
		return "CartDTO [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", bodyType="
				+ bodyType + ", cartId=" + cartId + "]";
	}
	
	
}
