package com.logicalproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		
	
String str  = "banana";

Map<Character, Long> map = new HashMap<Character, Long>();

str.chars()
.mapToObj(c -> (char) c)
.forEach(c -> map.put(c, map.getOrDefault(c, (long) 0) + 1));

System.out.println(map);


}
}
