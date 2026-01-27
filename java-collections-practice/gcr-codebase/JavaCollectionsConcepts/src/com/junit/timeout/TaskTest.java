package com.junit.timeout;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TaskTest {

    Task t= new Task();

    @Test
    @Timeout(2)
    void testTimeout() throws Exception {
        t.longRunningTask();   // this test will FAIL (as expected)
    }
}

