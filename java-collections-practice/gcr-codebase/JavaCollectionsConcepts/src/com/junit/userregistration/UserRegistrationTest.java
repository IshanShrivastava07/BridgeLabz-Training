package com.junit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration ur = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertTrue(ur.registerUser("Ishan", "ishan@gmail.com", "secret1"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> ur.registerUser("", "a@gmail.com", "secret1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> ur.registerUser("User", "wrongmail", "secret1"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> ur.registerUser("User", "a@gmail.com", "123"));
    }
}
