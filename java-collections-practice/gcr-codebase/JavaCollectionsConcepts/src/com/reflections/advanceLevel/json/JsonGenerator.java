package com.reflections.advanceLevel.json;

import java.lang.reflect.*;

public class JsonGenerator {

    static class Student {
        public String name = "Amit";
        public int marks = 85;
    }

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);

            json.append("\"").append(fields[i].getName()).append("\": ");
            Object value = fields[i].get(obj);

            if (value instanceof String)
                json.append("\"").append(value).append("\"");
            else
                json.append(value);

            if (i < fields.length - 1)
                json.append(", ");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        Student s = new Student();
        String json = toJson(s);

        System.out.println(json);
    }
}
