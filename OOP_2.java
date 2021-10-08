package com.company;

// We would be taling about important concept regarding to OOP

public class OOP_2 {
    //1. Inheritance

    //instantiating Bird class
    public static void main(String[] args) {

        Bird Falcon = new Bird("Tino", "Golden", 2, true, 2);

        // we can use any of the getter method of the parent class (Animal)
        System.out.println(Falcon.getName());

        Falcon.eat("meat");

       // System.out.println(Falcon.getWings());
        Falcon.fly();   // we can have methods with the same name when we have different number of argument or the same argument



        // 2. Polymorphism
        // This means having Multiple forms. There are two types of polymorphism
        // 1. Two methods inside a parent and a child class doing a job differently. ( Just like the "eat" method in the Bird and Animal class)
       // 2. Using mehods witt the same name in different ways. (Just like the fly method in the Bird class)


    }
}
