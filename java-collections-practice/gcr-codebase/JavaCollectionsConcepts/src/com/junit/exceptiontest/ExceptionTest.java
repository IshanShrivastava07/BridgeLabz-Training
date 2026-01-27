package com.junit.exceptiontest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.calculator.Calculator;

public class ExceptionTest {

    @Test
    void testException() {
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }
}
