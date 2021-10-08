package com.company;

// Tis class performs programming or cnstruction of codes in relation to OOP_1
public class Phone {
    String name;
    // when we declare a class we can reuse the class like the one above, we can also create multiple instance of the class with their properties
    int memoryram;
    int camera;

    // instantiating a class ( creating the instance of your class )
    public static void main(String[] args) {
// when you use constuctors you pass the value at the time of instantiating the class
        OOP_1 Android = new OOP_1("SamSung Galaxy Z", 6,8,16);
        System.out.println(Android.getName());


        // with the help of the new keyword we can create an instance of our object
        /*
       // Android.name = "Samsung Galaxy Z"; // with the dot(.) operator you can have access to the fields or properties of your class

        Android.setName("Samsung A80");
        // How to get the properties of this field
        System.out.println(Android.getName());

        //how to get the properties of a field
        Android.setMemoryram(8);

         */


        Android.playMusic("On our way");

        // few reasons for using methods
        // 1. You can reuse your method
        Android.playMusic("Wake me up");
        // 2. for organising our codes
        // 3. Encapsulation

        // creating another OOP_1 using the second constructor
        OOP_1 Iphone = new OOP_1("Iphone 11", 16);

    }
}