package com.logicalproblems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {
public static void main(String[] args) {
	List<Integer> list = List.of(10,40,30,20);
	
	int secondHighest = 
			list.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
	
	System.out.println(secondHighest);
	
}
}
