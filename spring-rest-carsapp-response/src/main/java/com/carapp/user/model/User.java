package com.carapp.user.model;


public class User {
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String city;
	private String email;
	private int password;
	private String favouriteActor;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String firstName, String middleName, String lastName, String dateOfBirth, String city,
			String email, int password, String favouriteActor) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.email = email;
		this.password = password;
		this.favouriteActor = favouriteActor;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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


	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getFavouriteActor() {
		return favouriteActor;
	}

	public void setFavouriteActor(String favouriteActor) {
		this.favouriteActor = favouriteActor;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", email=" + email + ", password="
				+ password + ", favouriteActor=" + favouriteActor + "]";
	}
	
	

	
	
	

}
