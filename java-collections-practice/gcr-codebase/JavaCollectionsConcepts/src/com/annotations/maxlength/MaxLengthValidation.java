package com.annotations.maxlength;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(5)
    String username;

    User(String username) throws Exception {
        Field f = this.getClass().getDeclaredField("username");
        MaxLength ml = f.getAnnotation(MaxLength.class);

        if (username.length() > ml.value()) {
            throw new IllegalArgumentException("Too long");
        }
        this.username = username;
    }
}

public class MaxLengthValidation {
    public static void main(String[] args) throws Exception {
        new User("Ishan");     // OK
        new User("Shrivastava"); // Exception
    }
}
