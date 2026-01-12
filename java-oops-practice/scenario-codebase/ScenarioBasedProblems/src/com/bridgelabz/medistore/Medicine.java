package com.bridgelabz.medistore;

import java.time.LocalDate;
import java.util.*;

   public abstract class Medicine implements ISellable{
  
	   protected String name;
     	 private  double price;
	   protected  LocalDate expiryDate;
	   private int quantity;
	   
	   Medicine(String name, double price, LocalDate expiryDate, int quantity){
		   this.name = name;
		   this.price = price;
		   this.expiryDate = expiryDate;
		   this.quantity = quantity;
	   }
   
	   
	    public  void displayDetails() { 
	   System.out.println("Medicine name: " + name);
	   System.out.println("Medicine price : " + price);
	   System.out.println("Medicine expiry Date: " + expiryDate);
	   System.out.println("Medicine quantity: " + quantity);
	   
	    }
	    
	    @Override
	    public  void sell(int units) {
	    	
	    	
	    if(units <= quantity && checkExpiry()) {
	    	quantity -= units;
	    	System.out.println(units + "Units sold : "+ name );
	    	
	    	System.out.println("Your total Bill is: "+totalBill(units));
	    }
	    else {
	    	System.out.println("Purchase Failed!!");
	    }
	    }
	    
	    public double totalBill(int units) {
			double total = price * units;
			if(total >= 500) {
				total -= total * 0.10;
			}
			return total;
		}
	   
   }
