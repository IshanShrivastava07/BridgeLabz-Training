package com.json.FilterJSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJSON {
    public static void main(String[] args) throws Exception {

        String jsonArray = """
        [
            {"name":"Amit","age":30},
            {"name":"Rahul","age":22},
            {"name":"Neha","age":28}
        ]
        """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(jsonArray);

        for (JsonNode node : array) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
