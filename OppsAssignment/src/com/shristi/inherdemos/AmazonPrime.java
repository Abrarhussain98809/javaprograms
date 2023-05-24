package com.shristi.inherdemos;

public class AmazonPrime extends Amazon {

	
	public AmazonPrime(String name, int subfees) {
		super(name, subfees);
		// TODO Auto-generated constructor stub
	}
	int sub;
	void showDetails(String type)
	{
		if(type.equals("prime")) {
			sub=subfees-500;
			System.out.println("subfees is "+sub);}
		else {
			System.out.println("subfees is "+subfees);}
	}
	
	void showCategories()
	{
		System.out.println("movies");
		System.out.println("tv shows");
		System.out.println("kids");
	}

}
