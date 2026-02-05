package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
	

	List<Integer> list = List.of(1,2,2,3,4,4,5);
	
	List<Integer> resIntegers = 
			
			list.stream()
			.distinct()
			.collect(Collectors.toList());
	
	System.out.println(resIntegers);
	
}
}
