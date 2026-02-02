package com.streams.eventattendee;

import java.util.*;

public class Welcomemessage {
    public static void main(String[] args) {
        List<String> attendees = List.of("Ishan", "Rahul", "Neha");

        attendees.forEach(name ->
                System.out.println("Welcome, " + name));
    }
}

