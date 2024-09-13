package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods d1=new E114JavaMethods() ;
        d1.add(3,27);

        E114JavaMethods d2=new E114JavaMethods();
        d2.multiply(10,3);

        // Call the subtract method with arguments that subtract to 20
        E114JavaMethods d3=new E114JavaMethods();
        d3.subtract(100,80);

    }

void multiply(int a, int b){
    System.out.println("Multiplication "+(a*b));
}
void add(int a, int b){
    System.out.println("Addition "+(a+b));
}
void subtract(int a, int b){
    System.out.println("Subtraction "+(a-b));
}
}
