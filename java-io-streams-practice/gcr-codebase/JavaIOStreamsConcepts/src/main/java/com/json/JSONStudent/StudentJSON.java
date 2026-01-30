package com.json.JSONStudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class StudentJSON {
public static void main(String[] args) {
	ObjectMapper mapper = new ObjectMapper();
	
	ObjectNode studentNode = mapper.createObjectNode();
	studentNode.put("name", "Ishan");
	studentNode.put("age", "22");
	studentNode.putArray("Subjects").add("DSA").add("JSON");
	
	System.out.println(studentNode.toPrettyString());
}
}
