package org.example.e121;

import org.example.e122.E122Variables;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;


    public static void main(String[] args) {
        E121Variables d=new E121Variables();
        E121Variables c=new E121Variables();

         d.intValue=35;
         d.doubleValue=145.5;
         d.charValue='F';
        System.out.println(d.intValue);
        System.out.println(d.doubleValue);
        System.out.println(d.charValue);

        c.intValue=40;
        c.doubleValue=200.5;
        c.charValue='M';
        System.out.println(c.intValue);
        System.out.println(c.doubleValue);
        System.out.println(c.charValue);

    }
}
