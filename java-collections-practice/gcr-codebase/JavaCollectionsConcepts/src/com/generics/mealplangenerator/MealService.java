package com.generics.mealplangenerator;

public class MealService {

    // Generic method → only MealPlan types allowed
    public static <T extends MealPlan> void generatePlan(T plan) {

        System.out.println("Personalized " + plan.type() + " Meal Plan:");

        for (String item : plan.getItems()) {
            System.out.println("- " + item);
        }
    }
}
