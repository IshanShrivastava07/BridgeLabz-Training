package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;



public class ReverseString {
public static void main(String[] args) {
	List<String> list = List.of("java","api");
	
	List<String> reStrings = 
	list.stream()
	.map(s -> new StringBuilder(s).reverse().toString())
	.collect(Collectors.toList());
	
			System.out.println(reStrings);
}
}
