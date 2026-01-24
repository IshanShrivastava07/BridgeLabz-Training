package com.collection.map;


import java.util.*;

public class InvertMap {
	public static void main(String[] args) {
		HashMap<String, Integer> mpHashMap = new HashMap<String, Integer>();
		mpHashMap.put("A", 1);
		mpHashMap.put("V", 2);
		mpHashMap.put("C", 1);
		
		HashMap<Integer, List<String>> resultHashMap = new HashMap<>();
		
		for(String keyString : mpHashMap.keySet()) {
			int valueString = mpHashMap.get(keyString);
		
		
		resultHashMap.putIfAbsent(valueString, new ArrayList<String>());
		resultHashMap.get(valueString).add(keyString);
	}
		System.out.println(resultHashMap);
  }
}
