package com.collection.insuarancepolicymanagement;

import java.time.LocalDate;
import java.util.*;

public class Insuarance {
	
	    public static void main(String[] args) {

	        // 1. Store policies in different sets
	        Set<Policy> hashSet = new HashSet<>();
	        Set<Policy> linkedHashSet = new LinkedHashSet<>();
	        Set<Policy> treeSet = new TreeSet<>();

	        Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000);
	        Policy p2 = new Policy(102, "Ravi", LocalDate.now().plusDays(40), "Auto", 3000);
	        Policy p3 = new Policy(103, "Neha", LocalDate.now().plusDays(20), "Home", 7000);
	        Policy p4 = new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000); // duplicate

	        // add to all sets
	        hashSet.add(p1); hashSet.add(p2); hashSet.add(p3); hashSet.add(p4);
	        linkedHashSet.add(p1); linkedHashSet.add(p2); linkedHashSet.add(p3); linkedHashSet.add(p4);
	        treeSet.add(p1); treeSet.add(p2); treeSet.add(p3); treeSet.add(p4);

	        // 2. All unique policies
	        System.out.println("All Policies:");
	        for (Policy p : hashSet) System.out.println(p);

	        // 3. Policies expiring in next 30 days
	        System.out.println("\nExpiring Soon:");
	        for (Policy p : hashSet) {
	            if (p.expiryDate.isBefore(LocalDate.now().plusDays(30))) {
	                System.out.println(p);
	            }
	        }

	        // 4. Policies by coverage type
	        System.out.println("\nHealth Policies:");
	        for (Policy p : hashSet) {
	            if (p.coverageType.equalsIgnoreCase("Health")) {
	                System.out.println(p);
	            }
	        }

	        // 5. Find duplicates (from list input)
	        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
	        Set<Integer> seen = new HashSet<>();

	        System.out.println("\nDuplicate Policies:");
	        for (Policy p : list) {
	            if (!seen.add(p.policyNumber)) {
	                System.out.println(p);
	            }
	        }

	        // TreeSet already sorted by expiry date
	        System.out.println("\nSorted by Expiry (TreeSet):");
	        for (Policy p : treeSet) System.out.println(p);
	    }
	}


