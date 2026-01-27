package com.annotations.override;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
