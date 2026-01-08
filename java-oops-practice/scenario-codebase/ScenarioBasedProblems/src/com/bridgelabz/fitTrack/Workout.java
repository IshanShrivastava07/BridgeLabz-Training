package com.bridgelabz.fitTrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;          
    protected double caloriesBurned;

    protected Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    
    public abstract void calculateCalories(double weight);

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
    }
}
