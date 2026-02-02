package com.functionalinterface.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        Function<String, Integer> lengthFinder = s -> s.length();

        String message = "Hospital emergency alert";

        int length = lengthFinder.apply(message);
        System.out.println(length);
    }
}
