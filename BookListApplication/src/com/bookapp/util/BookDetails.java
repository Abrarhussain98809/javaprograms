package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks() 
	{
		List<Book> books = Arrays.asList(
				new Book("java","Kathy",1,900,"Tech"),
				new Book("spring in action","Kathy",2,900,"Tech"),
				new Book("life after life","robert",3,900,"fiction"),
				new Book("Leadership","robin",4,900,"selfhelp"),
				new Book("club","abrar",5,900,"selfhelp"));
				return books;		
		
	}

}
