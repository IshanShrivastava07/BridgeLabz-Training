package com.bridgelabz.petpal;



import java.util.*;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    
    private int hunger;   
    private int energy;   
    private int mood;     

    
    public Pet(String name, String type, int age) {
        this(name, type, age, true);
    }

    
    public Pet(String name, String type, int age, boolean randomize) {
        this.name = name;
        this.type = type;
        this.age = age;

        if (randomize) {
            Random random = new Random();
            hunger = 30 + random.nextInt(40);
            energy = 40 + random.nextInt(40);
            mood = 50 + random.nextInt(30);
        }
    }

   
    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger +
                " | Energy: " + energy +
                " | Mood: " + mood);
    }

    
    public abstract void makeSound();
}

