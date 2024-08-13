package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'
        Car c1=new Car();

        c1.carColor="Black";
        c1.carYear=2019;
        c1.carMake="BMW";

        Car c2=new Car();

        c2.carColor="White";
        c2.carYear=2018;
        c2.carMake="Toyota";

        System.out.println("Car color is "+c1.carColor+ " and car year is "+c1.carYear+ " and car model is "+c1.carMake);
        System.out.println("Car color is "+c2.carColor+" and car year is "+c2.carYear+ " and car model is "+c2.carMake);



    }
}
