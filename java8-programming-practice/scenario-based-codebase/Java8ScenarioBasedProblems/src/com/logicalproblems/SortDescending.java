package com.logicalproblems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
public static void main(String[] args) {
	List<Integer> list = List.of(5,1,9,3);
	
	List<Integer> res =  
			list.stream()
			.sorted((a,b)-> b - a)
			.collect(Collectors.toList());
}
}
