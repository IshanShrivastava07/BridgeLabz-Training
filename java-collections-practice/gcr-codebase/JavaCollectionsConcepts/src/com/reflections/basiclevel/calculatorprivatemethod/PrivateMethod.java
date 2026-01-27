package com.reflections.basiclevel.calculatorprivatemethod;


import java.lang.reflect.*;

public class PrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();

        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);

        int result = (int) m.invoke(c, 4, 5);
        System.out.println("Result: " + result);
    }
}

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}
