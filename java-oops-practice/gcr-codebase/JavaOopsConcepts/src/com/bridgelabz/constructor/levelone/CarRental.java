package com.bridgelabz.constructor.levelone;
//Car Rental System
public class CarRental {
 String customerName, carModel;
 int rentalDays;
 double costPerDay = 1000;
 
 CarRental() {
     customerName = "Customer";
     carModel = "Basic";
     rentalDays = 1;
 }

 CarRental(String customerName, String carModel, int rentalDays) {
     this.customerName = customerName;
     this.carModel = carModel;
     this.rentalDays = rentalDays;
 }

 double calculateTotalCost() {
     return rentalDays * costPerDay;
 }

 public static void main(String[] args) {
     CarRental cr = new CarRental("Amit", "Sedan", 4);
     System.out.println("Total Cost: " + cr.calculateTotalCost());
 }
}


