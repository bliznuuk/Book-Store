package com.vbliznyuk.edu.java.bookstore.manage;

import com.vbliznyuk.edu.java.bookstore.book.Book;

public class BookService {
	
	NumberGenerator numberGenerator;
	
	public BookService() {
		numberGenerator = new IssnGenerator();
	}
	
	public Book createBook(String title, double price, String description) {
		Book book = new Book();
		book.setTitle(title);
		book.setPrice(price);
		book.setDescription(description);
		
		book.setNumber(numberGenerator.generateNumber());
		
		return book;
	}
}
