package com.workshop.smartcitytransport;

public interface GeoUtils {

    static double calculateDistance(double x1, double y1,
                                    double x2, double y2) {
        return Math.hypot(x2 - x1, y2 - y1);
    }
}
