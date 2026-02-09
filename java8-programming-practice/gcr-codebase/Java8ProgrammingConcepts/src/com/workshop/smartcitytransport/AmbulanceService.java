package com.workshop.smartcitytransport;

import java.time.LocalTime;

public class AmbulanceService
        implements TransportService, EmergencyService {

    public String serviceName() { return "Ambulance"; }
    public String routeName() { return "Emergency Corridor"; }
    public double ticketPrice() { return 0; }
    public LocalTime startTime() { return LocalTime.now(); }
}
