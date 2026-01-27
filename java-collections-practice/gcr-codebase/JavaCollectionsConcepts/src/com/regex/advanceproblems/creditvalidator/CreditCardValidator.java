package com.regex.advanceproblems.creditvalidator;

public class CreditCardValidator {

    public static void main(String[] args) {
        String visa = "4123456789012345";
        String master = "5123456789012345";

        String regex = "^(4\\d{15}|5\\d{15})$";

        System.out.println(visa.matches(regex));   // true
        System.out.println(master.matches(regex)); // true
    }
}
