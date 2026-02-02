package com.lambdafunction.alertsystem;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("EMERGENCY"),
                new Alert("APPOINTMENT"),
                new Alert("PROMOTION")
        );

        // User wants only emergency alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        alerts.stream()
                .filter(emergencyOnly)
                .forEach(System.out::println);
    }
}
