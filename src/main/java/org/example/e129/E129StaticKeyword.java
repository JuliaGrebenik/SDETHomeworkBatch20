package org.example.e129;

public class E129StaticKeyword {

    public static String countryName;
    public static String continent;

    public static void display(){
        System.out.println(countryName+ " located on "+continent+" continent");
    }

    public static void main(String[] args) {


        countryName="Morocco";
        continent="Africa";
        display();







    }
}
