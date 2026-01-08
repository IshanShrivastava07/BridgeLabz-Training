package com.bridgelabz.eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;          // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // Pricing (encapsulated)
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Event without services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double venueCost, User organizer) {
        this(eventId, eventName, location, date, attendees, venueCost, 0, 0, organizer);
    }

    // Event with services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees,
                 double venueCost, double serviceCost,
                 double discount, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    // Encapsulated cost calculation
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount; // operators used
    }

    public int getEventId() {
        return eventId;
    }
}

