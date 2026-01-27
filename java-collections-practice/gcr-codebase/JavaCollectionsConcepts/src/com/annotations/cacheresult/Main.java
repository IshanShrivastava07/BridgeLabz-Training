package com.annotations.cacheresult;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {

    Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int n) {
        System.out.println("Computing...");
        return n * n;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getMethod("square", int.class);

        int x = 5;

        if (c.cache.containsKey(x)) {
            System.out.println("From Cache: " + c.cache.get(x));
        } else {
            int result = (int) m.invoke(c, x);
            c.cache.put(x, result);
            System.out.println("Computed: " + result);
        }

        // Call again
        System.out.println("From Cache: " + c.cache.get(x));
    }
}
