package com.junit.temperatureConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    TemperatureConverter t = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, t.celsiusToFahrenheit(0));
        assertEquals(212, t.celsiusToFahrenheit(100));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, t.fahrenheitToCelsius(32));
        assertEquals(100, t.fahrenheitToCelsius(212));
    }
}

