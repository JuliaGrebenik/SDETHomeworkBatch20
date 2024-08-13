package org.example.e25;

import javax.swing.*;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense=6.55;
        double afternoonExpense=12.5;
        double eveningExpense=50.00;


        // Calculate total expense
        double totalExpense=(morningExpense+afternoonExpense+eveningExpense);
        System.out.println("Your total daily expense is " + totalExpense) ;



        // Define a budget
        double budget=100.0;

        if(totalExpense<=budget){
            System.out.println("You are within the budget.");
        }else {
                System.out.println("You are over te budget.");
            }


        // Check if within budget


    }
}
