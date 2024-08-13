package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int favoriteNumber;

        // Use a do-while loop to collect user input until they enter the number 7
        do {
            System.out.println("Enter your favorite number:");
            favoriteNumber = input.nextInt();
            // Print "You entered: " followed by the value of the variable
            System.out.println("You entered: " + favoriteNumber);
            // Print "You've entered 7! Loop ends."

        }while (favoriteNumber != 7) ;

            System.out.println("You've entered 7! Loop ends.");

    }

}
