package org.example.e137;

public class E137AccessModifiers {

    private String name;
    String city;
    protected String schoolName;
    public int batchNumber;

    void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }
    public static void main(String[] args) {

        E137AccessModifiers a=new E137AccessModifiers();

        a.name="John";
        a.city="Miami";
        a.schoolName="Syntax";
        a.batchNumber=9;

        a.display();


    }
}

