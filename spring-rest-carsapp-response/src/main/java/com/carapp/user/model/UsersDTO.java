package com.carapp.user.model;

import com.opencsv.bean.CsvBindByPosition;

public class UsersDTO {

	@CsvBindByPosition(position=0)
	private String firstName;
	@CsvBindByPosition(position=1)
	private String middleName;
	@CsvBindByPosition(position=2)
	private String lastName;
	@CsvBindByPosition(position=3)
	private String dateOfBirth;
	@CsvBindByPosition(position=4)
	private String city;
	@CsvBindByPosition(position=5)
	private String email;
	@CsvBindByPosition(position=6)
	private String favouriteActor;
	private String userId;
	private int password;
	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UsersDTO(String firstName, String middleName, String lastName, String dateOfBirth, String city, String email,
			String favouriteActor) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.email = email;
		this.favouriteActor = favouriteActor;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFavouriteActor() {
		return favouriteActor;
	}
	public void setFavouriteActor(String favouriteActor) {
		this.favouriteActor = favouriteActor;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UsersDto [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", email=" + email + ", favouriteActor="
				+ favouriteActor + ", userId=" + userId + ", password=" + password + "]";
	}
	
}
