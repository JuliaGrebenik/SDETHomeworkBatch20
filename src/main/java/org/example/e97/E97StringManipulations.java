package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input a browser name
        System.out.println("Please enter a browser name:");
        // Read the input string
        String browser = input.nextLine();
        // Use conditional statements to print the message based on the input
        if (browser.equals("Chrome") || browser.equals("chrome") || browser.equals("CHROME") || browser.equals("ChRoMe")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equals("firefox") || browser.equals("FIREFOX") || browser.equals("FireFox")) {
            System.out.println("Proceed with Forefox browser");
        }else if(browser.equals("IE")||browser.equals("ie")||browser.equals("iE")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }

    }
}
