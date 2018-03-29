package com.vbliznyuk.edu.java.bookstore;

import com.vbliznyuk.edu.java.bookstore.book.Book;
import com.vbliznyuk.edu.java.bookstore.manage.BookService;

public class Main {

	public static void main(String[] args) {
		
		BookService bs = new BookService();
		Book book = bs.createBook("cdi practice", 99.99, "master your knowledge");
		
		System.out.println(book);
	}

}
