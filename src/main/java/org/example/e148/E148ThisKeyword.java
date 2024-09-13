package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args) {

        ShoppingStore s1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore s2 = new ShoppingStore("Mattress", 219.59, 2);

        double blanketTotal =s1.itemTotalPrice();
        double mattressTotal=s2.itemTotalPrice();


        double totalSum = blanketTotal+mattressTotal;
        System.out.println("You purchased " + totalSum + " Today");


    }
}


   