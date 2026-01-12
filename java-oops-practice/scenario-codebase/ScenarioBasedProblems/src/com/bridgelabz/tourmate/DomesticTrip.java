package com.bridgelabz.tourmate;

public class DomesticTrip extends Trip {

	public DomesticTrip(String destinationString, double budget, int duration, Transport transport, Activity activity,
			Hotel hotel) {
		super(destinationString, budget, duration, transport, activity, hotel);
		
	}

	@Override
	public void book() {
		System.out.println("Domestic trip booked Successfully!!");
		
	}

	@Override
	public void cancel() {
		System.out.println("Domestic trip booking canceled!!");
		
	}
	
	

}
