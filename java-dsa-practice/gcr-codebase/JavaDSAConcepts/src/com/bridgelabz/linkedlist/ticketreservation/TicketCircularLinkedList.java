package com.bridgelabz.linkedlist.ticketreservation;

public class TicketCircularLinkedList {

    private TicketNode head;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode node = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Remove ticket by ID
    public void removeByTicketId(int id) {
        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String name) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Search by movie name
    public void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void printTicket(TicketNode t) {
        System.out.println(t.ticketId + " | " + t.customerName + " | " +
                t.movieName + " | Seat: " + t.seatNumber +
                " | Time: " + t.bookingTime);
    }
}
