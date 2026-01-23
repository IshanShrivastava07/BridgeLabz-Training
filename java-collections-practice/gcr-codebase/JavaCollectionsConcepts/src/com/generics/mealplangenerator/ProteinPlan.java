package com.generics.mealplangenerator;

public class ProteinPlan implements MealPlan {

    @Override
    public String type() {
        return "High Protein";
    }

    @Override
    public String[] getItems() {
        return new String[]{"Chicken", "Egg Whites", "Protein Shake"};
    }
}

