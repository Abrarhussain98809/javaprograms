package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> books=BookDetails.showBooks();
		List<Book> book1=books.stream().filter(book-> book.getAuthor().equals(author)).collect(Collectors.toList());
		return book1;
	}

	@Override
	public Optional<Book> getById(int bookId) {
		List<Book> books=BookDetails.showBooks();
		Optional<Book> bookbyauthor=books.stream().filter(book->((Integer)book.getId()).equals((Integer)bookId)).findFirst();
		return bookbyauthor;
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> books=BookDetails.showBooks();
		List<Book> getbyauthor=books.stream().filter(book->book.getCategory().equals(category)).collect(Collectors.toList());
		return getbyauthor;
	}

	
}
