package com.json.JSONValidate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        String json = "{ invalid json }";

        try {
            mapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
