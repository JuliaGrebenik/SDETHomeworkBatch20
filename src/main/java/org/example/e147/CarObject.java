package org.example.e147;

public class CarObject {
    private String model;
    private double price;
    private int quantity;

    CarObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public double carStockValue() {
        double totalStockValue = price * quantity;
        System.out.println(model + " Stock Value " + totalStockValue);
        return totalStockValue;
    }
}


