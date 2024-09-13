package org.example.e110;

public class E110JavaMethods {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        E110JavaMethods d1=new E110JavaMethods();
        d1.newLine();

        E110JavaMethods d2=new E110JavaMethods();
        d2.displayLine();



    }
}
