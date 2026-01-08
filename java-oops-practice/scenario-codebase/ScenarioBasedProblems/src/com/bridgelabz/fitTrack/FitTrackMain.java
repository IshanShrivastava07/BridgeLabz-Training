package com.bridgelabz.fitTrack;

public class FitTrackMain {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Rahul", 25, 72.5, 2200);
        user.showProfile();

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        WorkoutSession session = new WorkoutSession();

        cardio.startWorkout();
        cardio.calculateCalories(user.getWeight());
        cardio.stopWorkout();
        session.addWorkout(cardio);

        strength.startWorkout();
        strength.calculateCalories(user.getWeight());
        strength.stopWorkout();
        session.addWorkout(strength);

        double burned = session.getTotalCaloriesBurned();
        int target = user.getDailyCalorieGoal();

        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Calories: " + (target - burned)); // operator usage
    }
}
