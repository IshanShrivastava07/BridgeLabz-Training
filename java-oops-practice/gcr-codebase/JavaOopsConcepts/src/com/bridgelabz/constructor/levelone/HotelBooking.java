package com.bridgelabz.constructor.levelone;
// Creating class Hotel Booking 
public class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Rahul", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);
        System.out.println(h2.guestName + " " + h2.roomType);
    }
}
