package com.vbliznyuk.edu.java.bookstore;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.vbliznyuk.edu.java.bookstore.book.Book;
import com.vbliznyuk.edu.java.bookstore.manage.BookService;

@Singleton
public class Main {

	public void entryPoint(@Observes ContainerInitialized initEvent, @Parameters List<String> parameters) {
		BookService bs = new BookService();
		Book book = bs.createBook("cdi practice", 99.99, "master your knowledge");
		
		System.out.println(book);
	}
	
}
