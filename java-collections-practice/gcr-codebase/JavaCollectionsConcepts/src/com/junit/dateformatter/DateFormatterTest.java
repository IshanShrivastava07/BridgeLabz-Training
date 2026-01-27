package com.junit.dateformatter;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("26-01-2026", df.formatDate("2026-01-26"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> df.formatDate("26/01/2026"));
    }
}

