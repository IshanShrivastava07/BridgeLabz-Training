package com.logicalproblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlength {
public static void main(String[] args) {
	List<String> list = List.of("cat","elephant","dog");
	
	List<Integer> lengthIntegers = 
			list.stream()
			.map(String::length)
			.collect(Collectors.toList());
	
	System.out.println(lengthIntegers);
			
}
}
