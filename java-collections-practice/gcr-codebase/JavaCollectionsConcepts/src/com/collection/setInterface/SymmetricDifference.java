package com.collection.setInterface;

import java.util.*;

public class SymmetricDifference {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(symmetricDiff(set1, set2));   // [1, 2, 4, 5]
    }

    public static Set<Integer> symmetricDiff(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        // union
        result.addAll(b);         

        Set<Integer> common = new HashSet<>(a);
     // intersection
        common.retainAll(b);       

        result.removeAll(common);
        return result;
    }
}
