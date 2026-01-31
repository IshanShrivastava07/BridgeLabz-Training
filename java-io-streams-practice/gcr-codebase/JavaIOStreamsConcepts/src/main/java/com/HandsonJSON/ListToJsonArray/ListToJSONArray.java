package com.HandsonJSON.ListToJsonArray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;
    User(String n, int a) { name = n; age = a; }
}

public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(
            new User("Amit", 30),
            new User("Rahul", 22)
        );

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(users));
    }
}
