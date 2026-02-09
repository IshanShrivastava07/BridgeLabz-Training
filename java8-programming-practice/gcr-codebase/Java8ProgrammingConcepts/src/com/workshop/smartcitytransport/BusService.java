package com.workshop.smartcitytransport;

import java.time.LocalTime;

public class BusService implements TransportService {

    private String busRoute;
    private double busFare;
    private LocalTime busTime;

    public BusService(String busRoute, double busFare, LocalTime busTime) {
        this.busRoute = busRoute;
        this.busFare = busFare;
        this.busTime = busTime;
    }

    public String serviceName() { return "Bus"; }
    public String routeName() { return busRoute; }
    public double ticketPrice() { return busFare; }
    public LocalTime startTime() { return busTime; }
}
