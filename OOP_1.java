package com.company;

// We would be discussing about Classes: what they are, how can we create them and the usages of a class
// A class would be created related with the topics in this
public class OOP_1 {
/*
    // Creating a class
    public static class Phone {
        String name;
        // when we declare a class we can reuse the class like the one above, we can also create multiple instance of the class with their properties
        int memoryram;
        int camera;
     }
// instantiating a class ( creating the instance of your class )
    public static void main(String[] args) {
        Phone Android = new Phone();
        // with the help of the new keyword we can create an instance of our object
        Android.name = "Samsung Galaxy Z"; // with the dot(.) operator you can have access to the fields or properties of your class
        Android.memoryram = 8;


        //how to get the properties of a field
        System.out.println(Android.name);
        System.out.println(Android.memoryram);

        // Aside properties classes can also have behaviours
        // To define a property for your class you can use method

                    // Access Modifiers
     there are three kinds of access modifiers
     1. Private //  it means the field cannot be accessed from other classes
     2. Public  // it means the field would be accessed from other classes
     3. Protected

     // How can we have access to a private modifier
     public void setName (String name) {
        this.name = name;
     }


     // you use private when you use inner classes
     // Reasons for using Private modifiers
            1. You want to limit the access of your fields to the class itself and not other classes


 */
                // Changing the access modifiers of the four classes
    /*
    private String name;
    int screensize;
    int memoryram;
    int camera;
     */
    private String name;
    private int screensize;
    private int memoryram;
    private int camera;


    // Creating a constructor

    public OOP_1(String name, int screensize, int memoryram, int camera) {
        this.name = name;
        this.screensize = screensize;
        this.memoryram = memoryram;
        this.camera = camera;
    }
    // a class can have multiple constructors

    public OOP_1(String name, int memoryram) {
        this.name = name;
        this.memoryram = memoryram;
    }
// Having two types of constructors in a class is called "Polymorphism" in Java

    // How to define a method

    public void  playMusic (String trackName) {
        // Then the method have an access modifier
        // if you want to have multiple inputs for your methods yoy an separate them with a comma.
        //every method can return something, it can't only be void
        System.out.println("Playing " + trackName);
    }
    public void setName (String name) {
        this.name = name; //the keyword this is referring to the current object we are in
        //the second name is the input of this method
    }
    // To get The value of the field above, we create a method


    public String getName() {
        return name;
    }
//You can generate a method when you press alt + insert on the keyboard
    public int getCamera() {
        return camera; // if we don't want people to get the per mission to change our fields we can delete the setter
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
 //
    //The reason we use getters and setters are;
    // 1. Encapsulation  - if we don't want people to get the permission to change the properties our fields we can delete the setter (i.e they only get to get the properties)
    // 2. sometimes in our getter and setter methods we may want to do another operation as well. eg if your are setting a name for your phone you may want to validate that name before setting it


    public int getScreensize() {
        return screensize;
    }

    public void setScreensize(int screensize) {
        this.screensize = screensize;
    }

    public int getMemoryram() {
        return memoryram;
    }

    public void setMemoryram(int memoryram) {
        this.memoryram = memoryram;
    }

    public static void main(String[] args) {

    }

}
