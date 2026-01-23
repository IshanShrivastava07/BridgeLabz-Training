package com.generics.mealplangenerator;

public class VegPlan implements MealPlan {

    @Override
    public String type() {
        return "Vegetarian";
    }

    @Override
    public String[] getItems() {
        return new String[]{"Rice", "Dal", "Paneer", "Salad"};
    }
}
