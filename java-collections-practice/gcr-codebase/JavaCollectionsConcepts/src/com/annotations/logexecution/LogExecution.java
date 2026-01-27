package com.annotations.logexecution;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Work {

    @LogExecutionTime
    void fast() {
        for(int i=0;i<1000;i++);
    }

    @LogExecutionTime
    void slow() {
        for(int i=0;i<1000000;i++);
    }
}

public class LogExecution {
    public static void main(String[] args) throws Exception {
        Work w = new Work();

        for (Method m : Work.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(w);
                long end = System.nanoTime();
                System.out.println(m.getName() + " time: " + (end - start));
            }
        }
    }
}
