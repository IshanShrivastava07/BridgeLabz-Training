package com.HandsonJSON.FilterJSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FilterJSON {
public static void main(String[] args) throws Exception {
	String jsonString = """
			[{"name" : "Ishan", "age" : 22},
			{"name" : "Jai", "age" : 28},
			{"name" : "Hira", "age" : 26}
			]
			""";
	ObjectMapper mapper = new ObjectMapper();
	JsonNode array = mapper.readTree(jsonString);
	
	for(JsonNode node : array) {
		if(node.get("age").asInt() > 25) {
			System.out.println(node);
		}
	}
}
}
