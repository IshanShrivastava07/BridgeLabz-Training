package com.reflections.advanceLevel.objectmapping;

import java.lang.reflect.*;
import java.util.*;

public class ObjectMapper {

    static class Person {
        public String name;
        public int age;
    }

    // Mapper method
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }

        return obj;
    }

    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Ishan");
        map.put("age", 22);

        Person p = toObject(Person.class, map);

        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
    }
}
