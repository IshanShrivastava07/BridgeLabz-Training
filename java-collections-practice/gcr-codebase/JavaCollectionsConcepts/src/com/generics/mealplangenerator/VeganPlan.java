package com.generics.mealplangenerator;

public class VeganPlan implements MealPlan {

    @Override
    public String type() {
        return "Vegan";
    }

    @Override
    public String[] getItems() {
        return new String[]{"Quinoa", "Beans", "Fruits", "Veggies"};
    }
}
