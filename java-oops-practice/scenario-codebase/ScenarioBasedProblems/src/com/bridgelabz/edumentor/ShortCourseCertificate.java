package com.bridgelabz.edumentor;

public class ShortCourseCertificate implements ICertifiable {

    @Override
    public String generateCertificate(double scorePercentage) {
        if (scorePercentage >= 60) {
            return "Short Course Certificate: PASSED";
        }
        return "Short Course Certificate: NOT ELIGIBLE";
    }
}

