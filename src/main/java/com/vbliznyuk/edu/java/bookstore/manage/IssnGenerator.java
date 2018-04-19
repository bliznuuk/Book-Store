package com.vbliznyuk.edu.java.bookstore.manage;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		Random random = new Random();
		String firstFourNumbers = ("" + random.nextDouble()).substring(2, 6);
		String secondFourNumbers = ("" + random.nextDouble()).substring(2, 6);
		
		String issnNumber = firstFourNumbers + " " + secondFourNumbers;
		
		return issnNumber;
	}

}
