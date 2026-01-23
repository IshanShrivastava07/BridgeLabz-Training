package com.generics.mealplangenerator;

public class KetoPlan implements MealPlan {

    @Override
    public String type() {
        return "Keto";
    }

    @Override
    public String[] getItems() {
        return new String[]{"Eggs", "Chicken", "Cheese", "Nuts"};
    }
}

