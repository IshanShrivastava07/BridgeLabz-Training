package com.lambdafunction.uppercase;

import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> employeeNames = List.of("ishan", "kokashe", "harshit");

        employeeNames.stream()
                     .map(String :: toUpperCase)
                     .forEach(System.out::println);
    }
}
