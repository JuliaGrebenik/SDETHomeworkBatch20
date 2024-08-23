package src.main.java.org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        String[] days = new String[7];
        for (int i = 0; i < days.length; i++) {
            System.out.println("Please enter day " +(i+1)+ " of the week:");
            days[i]= input.nextLine();

        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);


        }


    }
}
