package com.json.ListToJSONArrray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Car {
    public String brand;
    public int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 6000000));
        cars.add(new Car("Audi", 5500000));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(cars);

        System.out.println(jsonArray);
    }
}
