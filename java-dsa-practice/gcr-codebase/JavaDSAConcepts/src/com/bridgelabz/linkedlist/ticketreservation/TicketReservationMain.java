package com.bridgelabz.linkedlist.ticketreservation;

public class TicketReservationMain {

    public static void main(String[] args) {

        TicketCircularLinkedList tickets = new TicketCircularLinkedList();

        tickets.addTicket(101, "Amit", "Inception", "A1", "10:30 AM");
        tickets.addTicket(102, "Neha", "Inception", "A2", "10:35 AM");
        tickets.addTicket(103, "Rahul", "Avatar", "B1", "11:00 AM");

        System.out.println("Booked Tickets:");
        tickets.displayTickets();

        System.out.println("\nSearch by Customer (Neha):");
        tickets.searchByCustomer("Neha");

        System.out.println("\nSearch by Movie (Inception):");
        tickets.searchByMovie("Inception");

        tickets.removeByTicketId(102);

        System.out.println("\nAfter Cancellation:");
        tickets.displayTickets();

        System.out.println("\nTotal Tickets Booked: " +
                tickets.countTickets());
    }
}
