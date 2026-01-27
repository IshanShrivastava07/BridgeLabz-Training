package com.reflections.advanceLevel.simpleDI;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class SimpleDI {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Inject { }

    static class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }

    static class Car {

        @Inject
        private Engine engine;

        public void drive() {
            engine.start();
            System.out.println("Car is running");
        }
    }

    // Simple DI Container
    static class Container {

        public static void injectDependencies(Object obj) throws Exception {

            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {

                    Object dependency = field.getType()
                            .getDeclaredConstructor()
                            .newInstance();

                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Car car = new Car();

        Container.injectDependencies(car);

        car.drive();
    }
}
