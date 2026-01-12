package com.bridgelabz.artify;

public abstract class Artwork implements IPurchasable {
	
	  protected String titleString;
	  protected String artist;
	  private double price;
	  protected String licenseType;
	
  public Artwork(String titleString, double price, String artist) {
		
		this.titleString = titleString;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
 
  public void showDetails() {
	  System.out.println("Title: " + titleString);
	  System.out.println("Artist name: "+ artist);
	  System.out.println("Price: "+ price);
	  System.out.println("license type: "+ licenseType);
	  
  }

  @Override
  public void purchase(User user) {
	if(!licenseType.equals(null)) {
		if(user.getWalletBalance() < price) {
			System.out.println("Wallet Balance is not sufficient");
		} else {
			System.out.println("\nArtwork Purchased in Amount "+ price);
			System.out.println();
			showDetails();
			user.deduceBalance(price);
		}
	}
	else {
		System.out.println("First provide a license to youe Art");
	}
	
  }

  
  
  
}
