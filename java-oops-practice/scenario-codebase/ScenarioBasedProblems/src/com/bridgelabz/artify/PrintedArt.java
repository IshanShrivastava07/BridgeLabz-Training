package com.bridgelabz.artify;

public class PrintedArt extends Artwork{

	public PrintedArt(String titleString, String artist, double price) {
		super(titleString, price, artist);
		
	}

	@Override
	public void license() {
		System.out.println("Providing License to the art: "+ titleString);
		licenseType = "Printing License";
		System.out.println("License Received"+licenseType);		
	}
}
