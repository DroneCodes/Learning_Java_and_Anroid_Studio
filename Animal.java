package com.company;

//This class would be extended to the bird and dog class

// we would be creating the Dog and bird class

public class Animal {
    private String name;
    private String color;
    private int legs; // number of legs
    private boolean hastail;

    // Creating a constructor

    public Animal(String name, String color, int legs, boolean hastail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hastail = hastail;
    }

    // creating  method
    public void eat (String food) { // to define the eating behaviour of the dog
        System.out.println("Eating " + food);
    }

    // change the behaviour of a method
    // Creating getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHastail() {
        return hastail;
    }

    public void setHastail(boolean hastail) {
        this.hastail = hastail;
    }
}
