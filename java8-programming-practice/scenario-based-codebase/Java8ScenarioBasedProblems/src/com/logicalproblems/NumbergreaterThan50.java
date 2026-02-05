package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class NumbergreaterThan50 {
public static void main(String[] args) {
	List<Integer> list = List.of(10,55,60,23,90);
	
	List<Integer> result = 
			list.stream()
			.filter(x -> x > 50)
			.collect(Collectors.toList());
	System.out.println(result);
}
}
