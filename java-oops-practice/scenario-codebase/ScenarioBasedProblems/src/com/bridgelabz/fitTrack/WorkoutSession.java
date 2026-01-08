package com.bridgelabz.fitTrack;

import java.util.*;


public class WorkoutSession {

    private List<Workout> workoutLog = new ArrayList<>();

    public void addWorkout(Workout workout) {
        workoutLog.add(workout);
    }

    public double getTotalCaloriesBurned() {
        double total = 0;
        for (Workout w : workoutLog) {
            total += w.getCaloriesBurned();
        }
        return total;
    }
}
