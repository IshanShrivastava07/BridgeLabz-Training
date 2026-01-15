package com.bridgelabz.ambulanceroute;

public class AmbulanceMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        System.out.println();
        route.routePatient();

        System.out.println();
        route.removeUnit("Radiology");

        System.out.println();
        route.routePatient();
    }
}
