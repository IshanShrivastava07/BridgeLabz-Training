package com.collection.insuarancepolicymanagement;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(int policyNumber, String holderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // uniqueness based only on policy number
    @Override
    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return policyNumber;
    }

    // TreeSet sorting by expiry date
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType;
    }
}
