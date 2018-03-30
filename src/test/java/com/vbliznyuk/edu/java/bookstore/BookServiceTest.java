package com.vbliznyuk.edu.java.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.vbliznyuk.edu.java.bookstore.book.Book;
import com.vbliznyuk.edu.java.bookstore.manage.BookService;

public class BookServiceTest {

	private BookService bookService;
	private Book testBook;
	
	@Before
	public void setUp() {
		bookService = new BookService();
		testBook = bookService.createBook("test", 999, "test");
	}

	@Test
	public void bookShouldBeCreated(){
		assertNotNull("BookService haven't created Book object", testBook);
	}
	
	@Test
	public void bookServiceShouldCorrectSetUpProperties() {
		String title = "book Test name!";
		double price = 123445.67;
		String description = "Some tiny description for testing correctnesses of creation new Book.";

		Book book = bookService.createBook(title, price, description);
		
		assertEquals("Book tittle has been setting up wrong!", book.getTitle(), title);
		assertEquals("Book price has been setting up wrong", book.getPrice(), price, 0.009);
		assertEquals("Book description has been setting up wrong!", book.getDescription(), description);
	}
}
