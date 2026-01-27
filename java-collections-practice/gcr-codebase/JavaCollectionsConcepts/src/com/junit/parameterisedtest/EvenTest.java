package com.junit.parameterisedtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenTest {

    Even e = new Even();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEven(int n) {
        assertTrue(e.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testOdd(int n) {
        assertFalse(e.isEven(n));
    }
}
