package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;


    // Create a method to display values of instance variables
    void display(){
        System.out.println("The capital of "+countryName+" is "+capital+" "+"and population is "+populationSize);
    }

    public static void main(String[] args) {
        E122Variables one=new E122Variables();
        E122Variables two=new E122Variables();

        one.countryName="USA";
        one.capital="Washington DC";
        one.populationSize=330000000;
         one.display();

         two.countryName="Kazakhstan";
         two.capital="Astana";
         two.populationSize=18500000;
         two.display();
    }
}
