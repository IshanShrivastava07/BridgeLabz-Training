package com.bridgelabz.tourmate;

public class TourMateMain {

	public static void main(String[] args) {
		
	
	Transport t1 = new Transport(5000);
	Activity a1 = new Activity(4000);
	Hotel h1 = new Hotel(5000);
	
 //domestic trip
	Trip domesticTrip = new DomesticTrip("McLeodganj", 50000, 5, t1, a1, h1);
		domesticTrip.displayDetails();
		domesticTrip.book();
		
		
		System.out.println();
		
		//international trip
		Trip internationalTrip = new InternationalTrip("Amsterdam", 420000, 11, t1, a1, h1);
		
		internationalTrip.displayDetails();
		internationalTrip.book();
}
}