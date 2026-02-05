package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;



public class Joinstrings {
public static void main(String[] args) {
	List<String> list = List.of("Java","Spring","Boot");
	
	String reStrings = 
			list.stream()
			.collect(Collectors.joining(","));
	
	System.out.println(reStrings);
}
}
