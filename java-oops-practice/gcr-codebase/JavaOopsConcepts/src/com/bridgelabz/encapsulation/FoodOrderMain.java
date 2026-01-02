package com.bridgelabz.encapsulation;

// Main class to process food orders
public class FoodOrderMain {

    // Single method to process all food items
    public static void processOrder(FoodItem[] items) {

        double totalBill = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double itemTotal = item.calculateTotalPrice();
            double discount = 0;

            // Apply discount if available
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = itemTotal - discount;
            totalBill += finalPrice;

            System.out.println("Item Total: " + itemTotal);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------------------");
        }

        System.out.println("Total Bill Amount: " + totalBill);
    }

    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] orderItems = { item1, item2 };

        processOrder(orderItems);
    }
}
