package com.reflections.basiclevel.dynamicmethodinvoke;



import java.lang.reflect.*;

public class DynamicInvoke {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();

        String methodName = "multiply";   // simulate user input

        Method m = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) m.invoke(obj, 6, 3);

        System.out.println("Result: " + result);
    }
}

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}
