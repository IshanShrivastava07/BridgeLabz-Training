package com.logicalproblems;


import java.util.Arrays;

public class CountWords {
public static void main(String[] args) {
	String str =  "Java is very powerful";
	
	long count = Arrays.stream(str.split(" "))
			.count();
	
	System.out.println(count);
}
}
