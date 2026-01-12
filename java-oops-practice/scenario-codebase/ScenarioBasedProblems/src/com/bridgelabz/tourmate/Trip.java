package com.bridgelabz.tourmate;

import java.time.LocalDate;

public abstract class Trip implements IBookable  {
	
	protected String destinationString;
	protected double budget;
	protected Transport transport;
	protected double getTotalCost;
	protected Activity activity;
	protected Hotel hotel;
	protected int duration;
	
	public Trip(String destinationString, double budget, int duration, Transport transport, Activity activity, Hotel hotel) {
		this.destinationString = destinationString;
		this.budget = budget;
		this.duration = duration;
		this.transport = transport;
		this.activity = activity;
		this.hotel = hotel;
		
		this.getTotalCost = transport.getCost() + hotel.getCost() + activity.getCost();
		
		
	}
	
	public void displayDetails() {
		System.out.println("Destination: "+ destinationString);
		System.out.println("Budget: "+ budget);
		System.out.println("Duration: "+ duration+ " days");
		System.out.println("-------------------------------");
	}
	
	
}

