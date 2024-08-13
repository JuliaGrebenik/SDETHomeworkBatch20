package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan=input.nextBoolean();

        String eligibility;
        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditScore=input.nextInt();



            if (creditScore<600) {
                eligibility="Not eligible";
            }else if(creditScore>=600 && creditScore<=700) {
                eligibility="Maybe eligible";
            }else if(creditScore>=701 &&creditScore<=800) {
                eligibility="Eligible";
            }else if(creditScore>800) {
                eligibility="Definitely eligible";
            }else {
                eligibility = "Unknown";
            }
        }else {
            eligibility="Unknown";
        }

        System.out.println("The eligibility is "+eligibility);



    }
}






