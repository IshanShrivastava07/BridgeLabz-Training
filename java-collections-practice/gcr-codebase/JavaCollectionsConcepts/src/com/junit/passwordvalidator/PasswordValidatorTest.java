package com.junit.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator pv = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(pv.isValid("Strong1A"));
    }

    @Test
    void testInvalidPasswordShort() {
        assertFalse(pv.isValid("Ab1"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(pv.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(pv.isValid("Password"));
    }
}
