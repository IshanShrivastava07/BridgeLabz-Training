package com.HandsonJSON.validateEmail;

import com.fasterxml.jackson.databind.*;

public class ValidateEmail {
    public static void main(String[] args) throws Exception {

        String json = "{\"email\":\"test@gmail.com\"}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(json);

        String email = node.get("email").asText();
        boolean valid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

        System.out.println(valid ? "Valid Email" : "Invalid Email");
    }
}
