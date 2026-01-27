package com.exceptionhandling.exceptionpropogation;

public class ExceptionPropagation {

    // method1 throws an ArithmeticException
    static void method1() {
        int result = 10 / 0;   // This will cause ArithmeticException
    }

    // method2 just calls method1 (does not handle exception)
    static void method2() {
        method1();   // Exception propagates to caller
    }

    public static void main(String[] args) {

        try {
            method2();   // Exception reaches main()

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

	