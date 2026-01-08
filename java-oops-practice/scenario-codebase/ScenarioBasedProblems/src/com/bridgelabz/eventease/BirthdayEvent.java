package com.bridgelabz.eventease;
public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String location, String date,
            int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        super(eventId, "Birthday Party", location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event Scheduled for " + date);
            System.out.println("Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Birthday Event rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
