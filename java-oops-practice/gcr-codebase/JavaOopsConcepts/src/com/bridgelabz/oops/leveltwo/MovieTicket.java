package com.bridgelabz.oops.leveltwo;

public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.out.println("House full! Ticket already booked");
        } else {
          this.seatNumber = seatNumber;
          this.price = price;
           this.isBooked = true;
          System.out.println("Ticket booked for movie: " + movieName);    
          System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    
    
    // Method to display ticket
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet");
        }
    }

    
    
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dragon");
        ticket.displayTicket();
        ticket.bookTicket("A10", 120);
        ticket.displayTicket();
    }
}
