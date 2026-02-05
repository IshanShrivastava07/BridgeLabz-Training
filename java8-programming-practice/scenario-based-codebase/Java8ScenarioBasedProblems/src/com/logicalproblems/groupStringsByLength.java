package com.logicalproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupStringsByLength {
public static void main(String[] args) {
	List<String> list = List.of("a","bb","ccc","dd");
    
	Map<Integer, List<String>> result =
			list.stream()
			.collect(Collectors.groupingBy(x -> x.length()
					));
	System.out.println(result);
 }
}
