package org.example.e157;

public class E157MethodOverloading {


    public static void main(String[] args) {


        TransactionCalculator t=new TransactionCalculator();

        t.calculateProfit(100, 20,30,10);

        TransactionCalculator t1=new TransactionCalculator();

        t1.calculateProfit(80,30,20);

        TransactionCalculator t3=new TransactionCalculator();

        t3.calculateProfit(50,30);
    }
}



