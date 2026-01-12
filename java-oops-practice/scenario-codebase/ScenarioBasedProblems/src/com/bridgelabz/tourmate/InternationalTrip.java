package com.bridgelabz.tourmate;

public class InternationalTrip extends Trip {

	public InternationalTrip(String destinationString, double budget, int duration, Transport transport,
			Activity activity, Hotel hotel) {
		super(destinationString, budget, duration, transport, activity, hotel);
		
	}

	@Override
	public void book() {
		System.out.println("International trip booked Successfully!!");
	}

	@Override
	public void cancel() {
		System.out.println("International trip booking canceled!!");
		
	}

}
