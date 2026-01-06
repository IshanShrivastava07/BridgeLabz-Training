package com.bridgelabz.stackqueuehashmap.circulartour;

import java.util.*;


public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();

        int sp = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            queue.add(i);
            sp += petrol[i] - distance[i];

            // If petrol becomes negative, reset
            while (sp < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                sp -= petrol[removed] - distance[removed];
                start = removed + 1;
            }
        }

        return (queue.size() == n) ? start : -1;
    }
}

