package org.example.e143;

public class E143Constructor {

    public static void main(String[] args) {

        Car c1=new Car("Toyota", "Prius",4,120,30000);
        Car c2=new Car("Toyota","Prius", 120,30000);
        Car c3=new Car(4, 120, 30000);
        Car c4=new Car("Toyota","Prius",4);

        c1.display();
        c2.display();
        c3.display();
        c4.display();


    }
}


