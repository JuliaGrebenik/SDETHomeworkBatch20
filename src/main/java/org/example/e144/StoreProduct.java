package org.example.e144;

public class StoreProduct {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct (String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;

    }
    public StoreProduct(String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    public StoreProduct (String label, double price){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=0;

    }
    public void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

}
