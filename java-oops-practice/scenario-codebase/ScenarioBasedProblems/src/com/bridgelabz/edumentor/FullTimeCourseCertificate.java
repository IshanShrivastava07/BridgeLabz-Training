package com.bridgelabz.edumentor;

public class FullTimeCourseCertificate implements ICertifiable {

    @Override
    public String generateCertificate(double scorePercentage) {
        if (scorePercentage >= 75) {
            return "Full-Time Course Certificate: DISTINCTION";
        }
        return "Full-Time Course Certificate: INCOMPLETE";
    }
}
