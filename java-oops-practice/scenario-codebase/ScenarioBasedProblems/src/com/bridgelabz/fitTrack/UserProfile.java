package com.bridgelabz.fitTrack;
public class UserProfile {

    private String name;
    private int age;
    private double weight;     
    private int dailyCalorieGoal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

  
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void showProfile() {
        System.out.println("User: " + name + ", Age: " + age);
        System.out.println("Daily Calorie Goal: " + dailyCalorieGoal);
    }
}
