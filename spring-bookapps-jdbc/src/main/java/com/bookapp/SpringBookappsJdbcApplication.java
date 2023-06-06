package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappsJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappsJdbcApplication.class, args);
	}

	@Autowired
	private IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
//		Book book=new Book();
//		book.setTitle("Spring");
//		book.setAuthor("abrar");
//		book.setCategory("tech");
//		book.setPrice(2000);
		
//		bookService.addBook(book);
//		bookService.updateBook(101, 45);
//		bookService.deleteBook(101);
//		bookService.getAll();
		System.out.println(bookService.getById(45));
//		bookService.getAll().stream().forEach(System.out::println);
//		bookService.getByCategory("tec").stream().forEach(System.out::println);
//		bookService.getByPriceLessThan(30).stream().forEach(System.out::println);
//		bookService.getByTitleContaining("java").stream().forEach(System.out::println);
//		bookService.getByAuthorStarting("hi").stream().forEach(System.out::println);
		
	}

}
