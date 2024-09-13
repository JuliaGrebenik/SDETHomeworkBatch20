package org.example.e145;

public class Dog {

    private String dogName;
    private double dogWeight;
    private static String dogBreed="Mutt";

    public Dog (String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
    public void displayDetails(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }



}
