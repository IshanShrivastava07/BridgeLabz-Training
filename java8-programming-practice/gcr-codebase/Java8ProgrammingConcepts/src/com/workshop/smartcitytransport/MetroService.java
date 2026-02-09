package com.workshop.smartcitytransport;

import java.time.LocalTime;

public class MetroService implements TransportService {

    private String metroLine;
    private double metroFare;
    private LocalTime metroStart;

    public MetroService(String metroLine, double metroFare, LocalTime metroStart) {
        this.metroLine = metroLine;
        this.metroFare = metroFare;
        this.metroStart = metroStart;
    }

    public String serviceName() { return "Metro"; }
    public String routeName() { return metroLine; }
    public double ticketPrice() { return metroFare; }
    public LocalTime startTime() { return metroStart; }
}
