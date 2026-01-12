package com.bridgelabz.foodloop;

public class FoodLoopMain {
    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 300, 3);

        Order comboOrder = new Order(paneer, chicken);
        comboOrder.placeOrder();
    }
}
