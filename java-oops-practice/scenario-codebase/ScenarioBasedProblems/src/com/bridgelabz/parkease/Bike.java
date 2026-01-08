package com.bridgelabz.parkease;

public class Bike extends Vehicle {

    public Bike(String number) {
        super(number, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 3 ? (hours - 3) * 10 : 0;
        return (ratePerHour * hours) + penalty;
    }
}
