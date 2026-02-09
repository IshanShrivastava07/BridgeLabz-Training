package com.workshop.smartcitytransport;

import java.time.LocalTime;

public interface TransportService {

    String serviceName();
    String routeName();
    double ticketPrice();
    LocalTime startTime();

    default void printServiceDetails() {
        System.out.println(serviceName() + " | " +
                routeName() + " | ₹" +
                ticketPrice() + " | " +
                startTime());
    }
}
