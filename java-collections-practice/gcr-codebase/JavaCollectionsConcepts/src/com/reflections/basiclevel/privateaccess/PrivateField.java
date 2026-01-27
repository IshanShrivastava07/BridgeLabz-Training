package com.reflections.basiclevel.privateaccess;


import java.lang.reflect.*;

public class PrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 30);   // modify
        System.out.println("Age: " + field.get(p));  // retrieve
    }
}

class Person {
    private int age = 20;
}

