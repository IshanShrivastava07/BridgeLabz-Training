package com.collection.setInterface;

import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> list = convert(set);
        System.out.println(list);   // [1, 3, 5, 9]
    }

    public static List<Integer> convert(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}

