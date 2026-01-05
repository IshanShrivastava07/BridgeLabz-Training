package com.bridgelabz.cabbygo;

public interface IRide {
    void bookRide(Vehicle vehicle, Driver driver, double distance);
    void endRide();
}

