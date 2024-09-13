package org.example.e143;

public class Car {

    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Car (String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Car( String make, String model, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;

        this.numberOfDoors=4;
        }
        public Car( int numberOfDoors, int topSpeed, double price){
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

        this.make="unknown";
        this.model="unknown";
        }
        public Car (String make, String model, int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
        }
        public void display(){
            System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
        }

    }


