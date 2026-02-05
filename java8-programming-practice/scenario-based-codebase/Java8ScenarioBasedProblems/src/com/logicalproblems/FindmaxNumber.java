package com.logicalproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindmaxNumber {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,25,3,99,45);
	
	 list.stream()
	.max(Comparator.comparingInt(Integer :: intValue))
	.get();
			
	
}
}
