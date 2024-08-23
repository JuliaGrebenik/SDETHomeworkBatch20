package src.main.java.org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
int mealType=input.nextInt();

double price=0.0;
boolean validMealType=true;

switch(mealType) {
    case 1:
        price = 5.00;
        break;
    case 2:
        price = 10.00;
        break;
    case 3:
        price = 15.00;
        break;
    default:
        System.out.println("Invalid meal type entered");
        validMealType = false;
        break;
}
// Print the price
        // Output: The price of your meal is $____
        if (validMealType){
            System.out.println("The price of your meal is $" + price);
        }



        // Print the price

    }
}
