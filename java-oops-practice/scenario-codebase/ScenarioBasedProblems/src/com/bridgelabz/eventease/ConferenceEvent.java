package com.bridgelabz.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String location, String date,
                           int attendees, double venueCost,
                           double serviceCost, double discount, User organizer) {

        super(eventId, "Conference", location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Scheduled for " + date);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Conference rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
