package com.junit.filehandling;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileProcessorTest {

    Filehandling fp = new Filehandling();

    @Test
    void testWriteAndRead() throws Exception {
        String file = "test.txt";
        fp.writeToFile(file, "Hello");

        assertTrue(new File(file).exists());
        assertEquals("Hello", fp.readFromFile(file));
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> fp.readFromFile("nofile.txt"));
    }
}

