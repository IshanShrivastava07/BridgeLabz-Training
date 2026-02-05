package com.logicalproblems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class FirstNonrepeatingCharacter {
public static void main(String[] args) {
	String string = "stress";
	
	char result = 
			string.chars()
			.mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(
					c -> c,
					LinkedHashMap :: new,
					Collectors.counting()
					))
					.entrySet()
					.stream()
					.filter(c -> c.getValue() == 1)
					.map(Map.Entry::getKey)
					.findFirst()
                     .get();			
			
    
	
}
}
