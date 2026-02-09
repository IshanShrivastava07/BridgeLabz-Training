package com.workshop.smartcitytransport;

import java.time.LocalTime;

public class PassengerTrip {

    String tripRoute;
    double paidAmount;
    LocalTime tripTime;

    public PassengerTrip(String tripRoute,
                         double paidAmount,
                         LocalTime tripTime) {
        this.tripRoute = tripRoute;
        this.paidAmount = paidAmount;
        this.tripTime = tripTime;
    }
}
