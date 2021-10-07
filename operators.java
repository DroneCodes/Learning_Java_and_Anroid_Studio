package com.company;

public class operators {
    public static void main(String[] args) {

                      
                          // Arithmetic Operators//

        int a = 18;
        int b = 10;

        // Addition
        int ans = a + b;
        System.out.println(ans);

        //Subtraction
        int an = a - b;
        System.out.println(an);

        //Multiplication
        int ad = a * b;
        System.out.println(ad);

        //Division
        int as = a / b;
        System.out.println(as);

        //Remainder
        int ns = a % b;
        System.out.println(ns);

        // Using + in adding Strings
        String firstName = "Oluwafisayomi";
        String lastName = "Ogunyemi";

        String fullname = firstName + " " + lastName;
        System.out.println(fullname);

        // increasing the value of a variable
        int ai = 6;
            ai = ai + 5; // Increase ai by 5

        ai +=2; // increase ai by 2

        ai++; // increase ai with 1
        ai--; // decrease i by 1

        ai -= 2; // decrease by 2

        ai *= 2; // multiply ai by 2
        ai /=2; //divide ai by 2
        System.out.println(ai);



                           // Relational and Logical Operators

               // Comparison operators are useful when you want to compare two things ( <, >, ==, >=, <=, != )

             int c = 7;
             int d = 8;

             boolean answer = a > b; // it would assign the value of true if the syntax is true
             boolean answer1 = a < b; // it would assign the value of false if the syntax is false
             boolean ansi = a == b; // it would print true if syntax is true
             boolean asd = a >= b;  // it would print true if syntax is true
             boolean ase = a <= b; // it would print true if syntax is true
             boolean ann = a != b; // check if a is not equal to b



                              // Logical Operators
          //  1.// OR
              boolean orl = a==5 || b==2; // if none of the conditions are true assign false
         //   2. AND
                boolean bio = a==5 && b==2; // assign true if both conditions are true ( both conditions must be true)


                                // Conditional Statements

        //     1. IF
                    if(a > 3) {
                        System.out.println("A is greater than 3");
                    } else {
                            System.out.println("A is less than 3");
                    }
                    System.out.println("Continue...");

            // 2. Switch
                    switch (a){
                        case 1:
                            System.out.println("A is One");
                            break;
                        case 2:
                            System.out.println("A is Two");
                            break;
                        default:
                            System.out.println("A is not One or Two");
                            break;
                    }


                                   //Loops

         //      1. for Loops
                   // syntax for for loop;
                    for(int i =0; i < 10; i++) {
                        System.out.println("Hello");
                    }
                    // The first statement defines the integer, the second statement is the condition of the loop and the third statement is just the statement or changing the value of the variable

            //    2. while Loop
                        int i = 5;
                        while ( i < 10 ) {
                        System.out.println("Hello World");
                        // Printing out like this results in an infinite loop, so changing the value of the variable is strongly allowed or adding a bre ak would allow the user to end the program
                         i++;
                         }
                         //Using the continue Keyword
                            int aj = 5;
                         while (aj<10) {

                             aj++; //it would stop an infinite loop
                            if (aj == 8) {
                                continue; // the continue allows you to go to the next record of your while loop (i.e break out of the while loop and go to the next record
                            }
                            System.out.println("Hello");// it won't print hello if a == 8
                         }

              //   3. Do while loop

                        do {
                            System.out.println("Hello");
                        } while (aj < 5);
                            // the do..wile loop allows you to execute your codes at least once no matter what the condition is



                //  Generating user input and a random number
        System.out.println("Please enter a number?");
        Scanner scanner = new Scanner(System.in);
        int Word = scanner.nextInt();
        System.out.println("number was: " +  Word);

        // Generate a Random number

        Random random = new Random();
        int number = random.nextInt(20); // inserting a number creates a bound for the amount of numbers the programme can pick from
        System.out.println("number: " + number);

    }
}
