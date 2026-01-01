package com.bridgelabz.inheritance;

public class RestaurantMain {
    public static void main(String[] args) {

        Worker w1 = new Chef();
        Worker w2 = new Waiter();

        w1.performDuties();
        w2.performDuties();
    }
}
