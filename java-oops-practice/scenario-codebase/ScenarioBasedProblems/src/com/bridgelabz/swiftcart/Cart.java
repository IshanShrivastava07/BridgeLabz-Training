package com.bridgelabz.swiftcart;
import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; // price * quantity
    }

    
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public double applyDiscount() {
        double discount = 0;
        for (Product p : products) {
            discount += p.calculateDiscount(); 
        }
        return discount;
    }

    @Override
    public void generateBill() {
        double discount = applyDiscount();
        double finalAmount = totalPrice - discount; // totalPrice - coupon

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount Payable: " + finalAmount);
    }
}
