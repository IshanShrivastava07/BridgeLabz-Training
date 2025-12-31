package com.bridgelabz.objectmodelling.levelone;

//Customer communicates using Order
public class ECommerceCustomer {
 String name;

 public ECommerceCustomer(String name) {
     this.name = name;
 }

 public void placeOrder(Order order) {
     System.out.println(name + " placed an order");
 }
}
