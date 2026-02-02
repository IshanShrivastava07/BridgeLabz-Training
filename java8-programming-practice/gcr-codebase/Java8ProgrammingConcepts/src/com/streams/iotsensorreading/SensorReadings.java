package com.streams.iotsensorreading;

import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = List.of(30, 55, 70, 40);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}
