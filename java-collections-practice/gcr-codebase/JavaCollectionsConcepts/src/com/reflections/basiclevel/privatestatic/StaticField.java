package com.reflections.basiclevel.privatestatic;



import java.lang.reflect.*;

public class StaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY");

        System.out.println("API_KEY: " + field.get(null));
    }
}
class Configuration {
    private static String API_KEY = "OLD_KEY";
}