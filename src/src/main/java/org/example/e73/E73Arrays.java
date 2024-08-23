package src.main.java.org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
            for (int i=numbers.length-1; i>=0; i--) {
                System.out.println(numbers[i]);

                // Use another loop to iterate through the array in reverse order and print each value on a new line

            }
        }
    }

