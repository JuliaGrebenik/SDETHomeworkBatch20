package org.example.e146;

public class E146ThisKeyword {
    public static void main(String[] args) {

        Employee e1=new Employee ();
        Employee e2=new Employee ("Joe", "Smith", 12345,"01/01/1970",35000);

        e1.printDetails();
        e2.printDetails();

    }
}
