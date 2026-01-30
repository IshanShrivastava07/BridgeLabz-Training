package com.json.JSONCar;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarJSON {
public static void main(String[] args) throws Exception{
	
	Car car = new Car("Mercedes", 5900000);
	
	
	ObjectMapper mapper = new ObjectMapper();
	String jsonString = mapper.writeValueAsString(car);
	
	System.out.println(jsonString);
			
    }
}
