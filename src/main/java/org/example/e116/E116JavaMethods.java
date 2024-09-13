package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        E116JavaMethods d1=new E116JavaMethods();
        d1.bothEven(45,67);
    }

    void bothEven(int a, int b){
        if(a%2==0 && b%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }


}
