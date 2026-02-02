package com.functionalinterface.passwordstrengthvalidator;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8;
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("secure123"));
    }
}
