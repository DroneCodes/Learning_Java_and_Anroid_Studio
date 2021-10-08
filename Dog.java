package com.company;

// this class is related to OOP_2

public class Dog extends Animal {   // we are extending the animal class here (i.e we are saying the bird is an animal)

    // Generating a Constructor

    public Dog(String name, String color, int legs, boolean hastail) {
        super(name, color, legs, hastail); // super Keyword means that do what your're doing here with the parent class (animal). the super keyword is passing this argument to the constructor of the animal class
    }

}


/*private String name;
    private String color;
    private int legs;
    //define a boolean indicating if the dog has a tail or not
    private boolean hasTail;

    public Dog(String name, String color, int legs, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    // defining a method for the class
    public void eat (String food) { // to define the eating behaviour of the dog
        System.out.println("Eating " + food);
    }


    // Creating Getters and Setters

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

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

 */

