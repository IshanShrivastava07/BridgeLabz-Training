package com.bridgelabz.trafficmanager;

public class TrafficManagerMain {
    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager();
        WaitingQueue queue = new WaitingQueue(3);

        queue.enqueue("CAR-101");
        queue.enqueue("CAR-102");
        queue.enqueue("CAR-103");
        queue.enqueue("CAR-104"); // overflow

        manager.addCar(queue.dequeue());
        manager.addCar(queue.dequeue());

        manager.printRoundabout();

        manager.removeCar();
        manager.printRoundabout();
    }
}

