package com.HandsonJSON.ReadJsonFile;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONFile {
public static void main(String[] args) throws IOException {
	ObjectMapper mapper = new ObjectMapper();
	JsonNode rootJsonNode = mapper.readTree(new File("data.json"));
	
	Iterator<Entry<String, JsonNode>> fieldsIterator = rootJsonNode.fields();
	while(fieldsIterator.hasNext()) {
		Map.Entry<String, JsonNode> entry = fieldsIterator.next();
		System.out.println(entry.getKey()+" "+ entry.getValue());
	}
}
}
