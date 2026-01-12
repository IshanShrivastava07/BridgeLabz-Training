package com.bridgelabz.artify;

public class DigitalArt extends Artwork {

	public DigitalArt(String titleString,  double price, String artist) {
		super(titleString,  price, artist);
		
	}

	@Override
	public void license() {
		System.out.println("Giving License to the art: "+ titleString);
		licenseType =  "Commercial License";
		System.out.println("License Received: "+ licenseType);
		
	}

}
