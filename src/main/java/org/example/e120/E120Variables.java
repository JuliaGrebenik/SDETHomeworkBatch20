package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String schoolName;
    int batchNumber;



    public static void main(String[] args) {
        E120Variables d= new E120Variables();
        d.year=2020;
        d.schoolName="Syntax";
        d.batchNumber=6;

        System.out.println("I am a student of batch "+ d.batchNumber+" studying at "+d.schoolName+" in the year of "+d.year);

        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
    }
}
