package com.collection.mapBasedQuestions.insuarancesystem;

import java.time.LocalDate;
import java.util.*;
public class Policy {
int number;
String holderString;
LocalDate expiryDate;
	
	public Policy(int number,
	String holderString,
	LocalDate expiryDate) {
			
		this.number = number;
		this.holderString = holderString;
		this.expiryDate = expiryDate;
	}
	
	public String toString() {
		return number + " " + holderString+ " "+ expiryDate;
	}
	
}
