package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] students = new String[5];

        // In Java indexes start from zero
        //Assigning values to an array
        students[1] = "Shola";
        students[0] ="Maupay";
        students[2] ="Empat";
        students[3] ="Rico";
        students[4] ="Troy";

        // to get the value of an element
        System.out.println(students[3]);


        // another wy to assign an array
        String[] employees = {"Fisayo", "Seto", "March"};

        //for loops are helpful when you work with different types of arrays

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i=0; i<numbers.length; i++) {    //To know the size of an array
            System.out.println(numbers[i]);
        }
        // Simulating a contact app

        String[] names = {"Tony", "Micheal", "James", "Kim", "Rondon"};
        int[] nums = {191882, 867622, 478942, 261712, 167162};

        // showing the names of available contact on the phone
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // finding the index of the contact

        for (int i=0; i<names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(nums[i]);
            }
        }
    }
}
