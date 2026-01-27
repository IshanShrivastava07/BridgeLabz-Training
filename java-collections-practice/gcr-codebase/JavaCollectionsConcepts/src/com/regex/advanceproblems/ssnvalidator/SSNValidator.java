package com.regex.advanceproblems.ssnvalidator;

public class SSNValidator {

    public static void main(String[] args) {
        String ssn1 = "987-65-4321";
        String ssn2 = "987654321";

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        System.out.println(ssn1.matches(regex)); // true
        System.out.println(ssn2.matches(regex)); // false
    }
}
