package com.annotations.suppresswarnings;

import java.util.*;

public class SupressWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        System.out.println(list.get(0));
    }
}
