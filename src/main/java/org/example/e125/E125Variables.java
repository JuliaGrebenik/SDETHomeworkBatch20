package org.example.e125;

public class E125Variables {
    // Declare a static variable at the class level to hold an integer value
    static int number;

    public static void main(String[] args) {


        E125Variables e= new E125Variables();
        e.number=200;
        System.out.println(E125Variables.number);
        System.out.println(e.number);
    }
}
