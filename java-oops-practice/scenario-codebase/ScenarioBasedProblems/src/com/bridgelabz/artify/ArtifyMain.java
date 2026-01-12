package com.bridgelabz.artify;

public class ArtifyMain {

	public static void main(String[] args) {
		
		//creating user
		User user = new User("Ishan", 7000000);
		
		//creating artwork
		Artwork art1 = new DigitalArt("DigitalArt Painting", 90000, "Ron");
		art1.license();
		art1.purchase(user);
		
		System.out.println("--------------------------------------------------");
		
		//creating artwork
		Artwork art2 = new PrintedArt("Monalisa", "Galileo", 990000);
       art2.license();
       art2.purchase(user);
	
	}
}
