package com.bookapp.model;

public class Book {
	private String title;
	private String author;
	private Integer id;
	private double price;
	private String category;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, Integer id, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.id = id;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getId() {
		return id;
	}
	public void setBooks(Integer id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", id=" + id + ", price=" + price + ", category="
				+ category + "]";
	}
	

}
