package com.streams.transformingnames;

import java.util.*;

public class NameTransform {
    public static void main(String[] args) {

        List<String> names = List.of("ishan", "rahul", "neha");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
