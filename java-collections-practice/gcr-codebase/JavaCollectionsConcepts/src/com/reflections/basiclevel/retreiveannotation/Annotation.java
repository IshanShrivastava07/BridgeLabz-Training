package com.reflections.basiclevel.retreiveannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Ishan")
class Book { }

public class Annotation {
    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + a.name());
    }
}
