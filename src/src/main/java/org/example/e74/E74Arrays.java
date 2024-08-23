package src.main.java.org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Use a loop to read 5 integers from the user and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 10;
            System.out.println(numbers[i]);

            // Use another loop to multiply each element of the array by 10 and print the result

        }
    }
}

