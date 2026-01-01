package com.bridgelabz.inheritance;


public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

