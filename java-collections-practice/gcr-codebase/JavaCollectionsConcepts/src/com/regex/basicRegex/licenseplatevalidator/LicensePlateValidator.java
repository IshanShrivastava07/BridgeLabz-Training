package com.regex.basicRegex.licenseplatevalidator;

public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("MH5678"));  // true
        System.out.println(isValidPlate("Mh5678"));  // false (lowercase letter)
        System.out.println(isValidPlate("M12345"));  // false (only one letter)
        System.out.println(isValidPlate("MH12A4"));  // false (letter inside digits)
    }
}
