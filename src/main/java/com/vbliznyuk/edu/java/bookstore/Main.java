package com.vbliznyuk.edu.java.bookstore;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.vbliznyuk.edu.java.bookstore.book.Book;
import com.vbliznyuk.edu.java.bookstore.manage.BookService;

public class Main {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		
		BookService bookService = container.select(BookService.class).get();
		Book book = bookService.createBook("cdi practice", 99.99, "master your knowledge");
		
		System.out.println(book);
		
		container.shutdown();
	}

}
