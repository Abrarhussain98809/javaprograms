package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	IBookRepository bookRepository;

	public BookServiceImpl(IBookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepository.updateBook(bookId, price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Book book=bookRepository.findById(bookId);
		if(book==null) {
			throw new BookNotFoundException("invalid id");
		}
		return book;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books=bookRepository.findByCategory(category);
		if(books.isEmpty()) {
			throw new BookNotFoundException("invalid category");
		}
		return books;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=bookRepository.findByPriceLessThan(price);
		if(books.isEmpty()) {
			throw new BookNotFoundException("invalid price");
		}
		return books;
	}

	@Override
	public List<Book> getByTitleContaining(String title) throws BookNotFoundException {
		List<Book> books=bookRepository.findByTitleContaining(title);
		if(books.isEmpty()) {
			throw new BookNotFoundException("invalid title");
		}
		return books;
	}

	@Override
	public List<Book> getByAuthorStarting(String author) throws BookNotFoundException {
		List<Book> books=bookRepository.findByAuthorStarting(author);
		if(books.isEmpty())
		{
			throw new BookNotFoundException("invalid author");
		}
		return books;
	}

}
