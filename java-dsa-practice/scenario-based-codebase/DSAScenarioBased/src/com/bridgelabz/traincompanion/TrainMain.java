package com.bridgelabz.traincompanion;

public class TrainMain {

    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("Sleeper");
        train.addCompartment("AC");
        train.addCompartment("Pantry");
        train.addCompartment("WiFi");
        train.addCompartment("General");

        train.moveForward();
        train.moveBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("WiFi");

        train.moveForward();
    }
}
