package com.company;

// his class is also related to the OOP_2 and Dog class
public class Bird  extends Animal{  // we are extending the animal class here (i.e we are saying the bird is an animal)

    // customise the bird class to show a distinct behaviour from the dog class
    private int wings;

// Generating a constructor

    public Bird(String name, String color, int legs, boolean hastail, int wings) {
        super(name, color, legs, hastail);
        this.wings = wings;
    }
    // change the behaviour of a method

    @Override  // Override means you want to change the behaviour of a method from what's happening in the parent class
    public void eat(String food) {
      //  super.eat(food);
        System.out.println("Chewing " + food);
    }


    // Defining another method within this class

    public void fly () {
        System.out.println(this.getName() + " is flying");
    }

    // Having a similar method named fly ( Defining two different methods with the same name)
   /*
    public void  fly (int speed) {


    }
    public void fly (String name) {

    }
    */


        // Creating Getters and Setters

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }


    /*
    public Bird(String name, String color, int legs, boolean hastail) {
        super(name, color, legs, hastail); // super Keyword means that do what your're doing here with the parent class (animal). the super keyword is passing this argument to the constructor of the animal class
    }
     */
}
    /*
    private String name;
    private String color;
    private int legs; // number of legs
    private boolean hastail;

    // Creating a constructor

    public Bird(String name, String color, int legs, boolean hastail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hastail = hastail;
    }

    //creating a method

    public  void  eat (String food) {
        System.out.println("Eating " + food);
    }


    // Creating a getter and setter


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

     */

