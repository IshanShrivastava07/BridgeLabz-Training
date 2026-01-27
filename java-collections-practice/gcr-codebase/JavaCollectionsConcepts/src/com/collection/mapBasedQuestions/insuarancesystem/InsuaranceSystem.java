package com.collection.mapBasedQuestions.insuarancesystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InsuaranceSystem {
public static void main(String[] args) {
	Map<Integer, Policy> hashMap = new HashMap<Integer, Policy>();
	Map<Integer, Policy> linkedhashMap = new LinkedHashMap<Integer, Policy>();
	Map<LocalDate, Policy > treehashMap = new TreeMap<LocalDate, Policy>();
	
	Policy p1 = new Policy(1, "Ishan", LocalDate.now().plusDays(50));
	Policy p2 = new Policy(2, "Harshit", LocalDate.now().plusDays(20));
	Policy p3 = new Policy(3, "Sumyash", LocalDate.now().plusDays(4));
	
	hashMap.put(p1.number, p1);
	hashMap.put(p2.number, p2);
	hashMap.put(p3.number, p3);
	
	linkedhashMap.putAll(hashMap);
	
	treehashMap.put(p1.expiryDate, p1);
	treehashMap.put(p2.expiryDate,p2 );
	treehashMap.put(p3.expiryDate, p3);
	
	System.out.println("Policy Number : 1" + p1.number);
	
	
	System.out.println("Policies Expiring Soon");
	for(Policy p : hashMap.values()) {
		if(p.expiryDate.isBefore(LocalDate.now().plusDays(30)));
		System.out.println(p);
	}

	System.out.println("PolicyHolder Name: ");
	for(Policy p : hashMap.values()) {
		if(p.holderString.equals("Ishan"))
		 System.out.println(p.holderString);
	}
	
	
	hashMap.values().removeIf(p-> p.expiryDate.isBefore(LocalDate.now().plusDays(30)));
	
	 System.out.println("\nAfter removing expired:");
     System.out.println(hashMap);
 	
	
   }
}
