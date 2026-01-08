package com.bridgelabz.parkease;

public class Car extends Vehicle {

    public Car(String number) {
        super(number, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 2 ? (hours - 2) * 20 : 0;
        return (ratePerHour * hours) + penalty;
    }
}
