package com.junit.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils s = new StringUtils();

    @Test void testReverse() {
        assertEquals("avaJ", s.reverse("Java"));
    }

    @Test void testPalindrome() {
        assertTrue(s.isPalindrome("madam"));
        assertFalse(s.isPalindrome("java"));
    }

    @Test void testUpperCase() {
        assertEquals("HELLO", s.toUpperCase("hello"));
    }
}

