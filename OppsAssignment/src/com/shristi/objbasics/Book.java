package com.shristi.objbasics;

public class Book {
		String title;
		String author;
		int price;
		String category;
		public Book(String title, String author, int price, String category) {
			super();
			this.title = title;
			this.author = author;
			this.price = price;
			this.category = category;
		}
		void getDetails() {
			if(price>500)
			{
				System.out.println("Premium book...");
			}
			else
			{
				System.out.println("Standard book...."); 
			}
		}

	

}
