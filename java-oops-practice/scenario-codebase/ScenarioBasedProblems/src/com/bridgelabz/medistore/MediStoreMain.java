package com.bridgelabz.medistore;

import java.time.LocalDate;

public class MediStoreMain {
	public static void main(String[] args) {
		
		Medicine med1 = new Tablet("Paracetamol", 25,LocalDate.now().plusYears(1), 150);
		Medicine syr1 = new Syrup("HoneyTus", 150, LocalDate.now().plusYears(2), 40);
		Medicine inj1 = new Injection("B12",500, LocalDate.now().plusYears(3), 25);
		
		System.out.println("------TRANSACTION HISTORY------");
		
		med1.displayDetails();
		med1.sell(30);
		System.out.println();
		syr1.displayDetails();
		syr1.sell(1);
		System.out.println();
		inj1.displayDetails();
		inj1.sell(10);
		
		
	}
	


}
