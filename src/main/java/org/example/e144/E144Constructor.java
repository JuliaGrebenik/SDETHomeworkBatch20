package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {

        StoreProduct p1=new StoreProduct("Eggs", 3.0,"Produce",true, 10);
        StoreProduct p2=new StoreProduct("Paper Towels", 2.0,24);
        StoreProduct p3=new StoreProduct("Paper Towels", 2.0);

        p1.display();
        p2.display();
        p3.display();




    }
}
