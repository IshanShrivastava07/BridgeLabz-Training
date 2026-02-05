 package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {
public static void main(String[] args) {
	List<String> list = List.of("java", "", "spring", "", "boot");
	
	List<String> resultList = 
			list.stream()
			.filter(s -> !s.isEmpty())
			.collect(Collectors.toList());
	
	System.out.println(resultList);
}
}
