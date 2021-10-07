package com.company;


import java.util.Random;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to my GuessWorld. This is Drone");

        System.out.println();
        //ask the user for a name
        System.out.println("Hello There, If you don't mind may i know your name? ");

        // ask the user to input his/her name
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // Introduction
        System.out.println("Hello, " + name);

        System.out.println();
        System.out.println("This game is a guessing game where you guess a random number, if you don't get it first don't worry you have five tries: Then game over.... so try your best");

        // Asking if the user is ready
        System.out.println("Are you ready....... :)");
        System.out.println("\t1, Yes");
        System.out.println("\t2, No");

        //saving the user answer
        Scanner scanner1 = new Scanner(System.in);
        int answer = scanner.nextInt();

        //Create a while loop
        while (answer != 1) {
            System.out.println("Are you ready....... :)");
            System.out.println("\t1, Yes");
            System.out.println("\t2, No");

            answer = scanner.nextInt(); // user won't be able to break out until user answers
        }


        // Generate a Random Number
        Random random = new Random();
        int number = random.nextInt(20) + 1;

        // Ask user to guess a number
        System.out.println("Please can you guess a number?");

        //save the users answer
        int userans = scanner.nextInt();

        //save times user tried the game
        int tries = 0;
        boolean passed = false;
        boolean endgame = false;

        // To check user answer
        while (!endgame) {
            tries++;

            if(tries < 5) {
                if (userans == number) {
                    passed = true;
                    endgame = true;
                }else if (userans > number) {
                    System.out.println("Guess lower");
                    userans = scanner.nextInt();
                }else {
                    System.out.println("Guess higher");
                    userans = scanner.nextInt();
                }
            }else {
                endgame = true;
            }
        }

        // To check if user has won the game
        if (passed) {
            System.out.println("You are a Genius, Congratulations!!!!!. You have guessed in your " + tries + " guess");
        }else {
            System.out.println("Sorry, Game Over");
            System.out.println("The number was: " + number);
        }

    }
}
