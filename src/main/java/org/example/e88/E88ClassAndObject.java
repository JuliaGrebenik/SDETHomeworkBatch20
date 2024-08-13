package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        Dog d1=new Dog ();
        d1.breed="Husky";
        d1.name="Mickey";
        d1.color="White";




        Dog d2=new Dog ();
        d2.breed="Bulldog";
        d2.name="Rocky";
        d2.color="Brown";


        Dog d3= new Dog();
        d3.breed="Labrador";
        d3.name="Zeus";
        d3.color="Grey";


        d1.bark();
        d1.run();
        d1.play();

        d2.bark();
        d2.run();
        d2.play();

        d3.bark();
        d3.run();
        d3.play();










    }
}
