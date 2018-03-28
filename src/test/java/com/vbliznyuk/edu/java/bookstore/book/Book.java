package com.vbliznyuk.edu.java.bookstore.book;

public class Book {
	private String title;
	private double price;
	private String description;
	private String number;
	
	public Book() {
	}

	/**
	 * @return the title of the Book
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set to the Book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price of the Book
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set to the Book
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the description of the Book
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set to the Book
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the number of the Book
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set to the Book
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
