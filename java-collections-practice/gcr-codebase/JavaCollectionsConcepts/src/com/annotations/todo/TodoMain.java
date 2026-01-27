package com.annotations.todo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task = "Login feature", assignedTo = "Amit")
    void login() {}

    @Todo(task = "Payment module", assignedTo = "Ravi", priority = "HIGH")
    void payment() {}
}

public class TodoMain {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " - " + t.assignedTo() + " - " + t.priority());
            }
        }
    }
}
