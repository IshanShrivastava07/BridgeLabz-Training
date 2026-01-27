package com.regex.basicRegex.hexcolorvalidator;

public class HexColorValidator {

    public static boolean isValidHex(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidHex("#1A2B3C")); // true
        System.out.println(isValidHex("#abc999")); // true
        System.out.println(isValidHex("123456"));  // false (missing #)
        System.out.println(isValidHex("#ZZZZZZ")); // false (not hex characters)
    }
}

