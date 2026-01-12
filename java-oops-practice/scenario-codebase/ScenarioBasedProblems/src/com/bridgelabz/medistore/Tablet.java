package com.bridgelabz.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine {

	Tablet(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}

	@Override
	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now());
	}
}
