package com.annotations.jsonfeild;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    String name;

    @JsonField(name = "user_age")
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        User u = new User("Ishan", 22);

        StringBuilder json = new StringBuilder("{");

        for (Field f : User.class.getDeclaredFields()) {
            JsonField jf = f.getAnnotation(JsonField.class);
            f.setAccessible(true);
            json.append("\"").append(jf.name()).append("\":\"")
                .append(f.get(u)).append("\",");
        }

        json.deleteCharAt(json.length()-1);
        json.append("}");

        System.out.println(json);
    }
}
