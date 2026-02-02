package com.functionalinterface.temperaturealert;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        Predicate<Double> highTemp = temp -> temp > 40;

        double temperature = 42;

        if (highTemp.test(temperature)) {
            System.out.println("ALERT: High temperature!");
        }
    }
}
