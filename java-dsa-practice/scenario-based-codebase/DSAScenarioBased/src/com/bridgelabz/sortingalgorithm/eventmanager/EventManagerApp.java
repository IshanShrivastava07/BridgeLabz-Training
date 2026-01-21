package com.bridgelabz.sortingalgorithm.eventmanager;

public class EventManagerApp {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket("Rock Concert", 2500),
            new Ticket("Tech Conference", 1200),
            new Ticket("Comedy Show", 800),
            new Ticket("Music Festival", 3000),
            new Ticket("Startup Meetup", 600)
        };

        System.out.println("Before Sorting:");
        QuickSorter.display(tickets);

        QuickSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting (by Price):");
        QuickSorter.display(tickets);

        System.out.println("\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tickets[i].eventName + " - ₹" + tickets[i].price);
        }

        System.out.println("\nTop 3 Most Expensive Tickets:");
        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
            System.out.println(tickets[i].eventName + " - ₹" + tickets[i].price);
        }
    }
}
