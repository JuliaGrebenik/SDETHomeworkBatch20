package src.main.java.org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = input.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = input.nextBoolean();

        String subject;

        if (isWeekend && isAvailable) {
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else {

            subject = "no subject";
        }

        System.out.println("Today you will be learning " + subject);

            input.close();

    }
}


