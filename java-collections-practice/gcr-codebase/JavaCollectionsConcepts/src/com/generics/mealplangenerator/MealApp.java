package com.generics.mealplangenerator;

public class MealApp {

    public static void main(String[] args) {

        MealPlan veg = new VegPlan();
        MealPlan keto = new KetoPlan();
        MealPlan protein = new ProteinPlan();

        MealService.generatePlan(veg);
        System.out.println();

        MealService.generatePlan(keto);
        System.out.println();

        MealService.generatePlan(protein);
    }
}
