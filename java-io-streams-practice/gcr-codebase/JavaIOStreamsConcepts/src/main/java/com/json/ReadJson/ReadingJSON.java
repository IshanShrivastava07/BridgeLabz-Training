package com.json.ReadJSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReadingJSON {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	
	String jsonString = """
		{
			"name" : "Ishan",
			"age":"22",
			"email" : "ishansh@gmail.com"
		}
	""";
	
	ObjectMapper mapper = new ObjectMapper();
	 JsonNode readJsonNode = mapper.readTree(jsonString);
	 
	 System.out.println(readJsonNode.get("name").asText());
	 System.out.println(readJsonNode.get("email").asText());
	 
	}
}
