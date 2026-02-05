package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class CountStartingWithA {
public static void main(String[] args) {
	List<String> list = List.of("apple","banana","ant","car");
	
	long count = list.stream()
			.filter(x -> x.startsWith("a"))
			.collect(Collectors.counting());
	System.out.println(count);
			
}
}
