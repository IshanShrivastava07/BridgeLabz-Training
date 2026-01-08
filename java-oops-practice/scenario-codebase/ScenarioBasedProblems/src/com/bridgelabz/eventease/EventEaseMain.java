package com.bridgelabz.eventease;

public class EventEaseMain {
    public static void main(String[] args) {

        User organizer = new User("Neha", "neha@email.com");

        Event birthday = new BirthdayEvent(
                101, "Banquet Hall", "15-Aug-2026",
                50, 30000, 10000, 2000, organizer
        );

        Event conference = new ConferenceEvent(
                102, "Convention Center", "20-Sep-2026",
                300, 120000, 50000, 15000, organizer
        );

        birthday.schedule();
        System.out.println();

        conference.schedule();
        conference.reschedule("25-Sep-2026");
        conference.cancel();
    }
}
