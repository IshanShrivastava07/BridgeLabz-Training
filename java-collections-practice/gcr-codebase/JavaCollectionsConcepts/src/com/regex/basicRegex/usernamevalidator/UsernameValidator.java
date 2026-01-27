package com.regex.basicRegex.usernamevalidator;

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidUsername("Admin_01"));   
        System.out.println(isValidUsername("_user12"));   
        System.out.println(isValidUsername("User"));      
        System.out.println(isValidUsername("User@123")); 
    }
}
