package com.junit.listmanager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    ListManager lm = new ListManager();

    @Test void testAdd() {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test void testRemove() {
        List<Integer> list = new ArrayList<>(List.of(5, 10));
        lm.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test void testSize() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        assertEquals(3, lm.getSize(list));
    }
}
