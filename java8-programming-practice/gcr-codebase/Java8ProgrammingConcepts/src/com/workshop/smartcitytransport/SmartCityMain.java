package com.workshop.smartcitytransport;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCityMain {

    public static void main(String[] args) {

        List<TransportService> transportList = List.of(
                new BusService("A-B", 30, LocalTime.of(9, 0)),
                new MetroService("A-B", 50, LocalTime.of(8, 30)),
                new BusService("B-C", 25, LocalTime.of(10, 0)),
                new AmbulanceService()
        );

        // Lambda + Method Reference + forEach
        transportList.stream()
                .filter(t -> t.ticketPrice() <= 40)
                .sorted(Comparator.comparing(TransportService::startTime))
                .forEach(TransportService::printServiceDetails);

        // Functional Interface with Lambda
        FareCalculator fareLogic = d -> d * 12;
        System.out.println("Calculated Fare: " + fareLogic.calculateFare(6));

        List<PassengerTrip> tripList = List.of(
                new PassengerTrip("A-B", 30, LocalTime.of(9, 0)),
                new PassengerTrip("A-B", 50, LocalTime.of(8, 30)),
                new PassengerTrip("B-C", 25, LocalTime.of(10, 0))
        );

        // groupingBy
        Map<String, List<PassengerTrip>> routeWiseTrips =
                tripList.stream()
                        .collect(Collectors.groupingBy(t -> t.tripRoute));

        // partitioningBy (peak before 9 AM)
        Map<Boolean, List<PassengerTrip>> peakTrips =
                tripList.stream()
                        .collect(Collectors.partitioningBy(
                                t -> t.tripTime.isBefore(LocalTime.of(9, 0))
                        ));

        // summarizingDouble
        DoubleSummaryStatistics revenueStats =
                tripList.stream()
                        .collect(Collectors.summarizingDouble(t -> t.paidAmount));

        System.out.println(revenueStats);

        // Marker Interface usage
        transportList.stream()
                .filter(t -> t instanceof EmergencyService)
                .forEach(t -> System.out.println(
                        "EMERGENCY PRIORITY: " + t.serviceName()
                ));
    }
}
