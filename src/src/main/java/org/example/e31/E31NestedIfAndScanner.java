package src.main.java.org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Declare a boolean variable isSunny
        // Print "Is it sunny outside? (true/false)"
        System.out.println("Is it sunny outside? (true/false)");
        // Capture the user's input and store it in isSunny
        boolean isSunny = input.nextBoolean();
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
            // Declare an integer variable temperature
            System.out.println("What is the temperature outside?");
            int temperature = input.nextInt();

            if (temperature > 85) {
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        }else{
                System.out.println("I stay home and practice Java");

            }


        }

    }