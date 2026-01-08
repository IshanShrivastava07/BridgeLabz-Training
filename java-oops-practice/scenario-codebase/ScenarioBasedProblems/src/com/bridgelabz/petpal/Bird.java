package com.bridgelabz.petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        changeMood(8);
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(12);
    }

    @Override
    public void sleep() {
        changeEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }
}
