package com.bookapp.main;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService ibookService=new BookServiceImpl();
		System.out.println(ibookService.getAll());
		System.out.println(ibookService.getByAuthor("robin"));
		System.out.println(ibookService.getById(2));
		System.out.println(ibookService.getByCategory("Tech"));

	}

}
