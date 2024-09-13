package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method

        System.out.println("sumEvenToX(5)==>"+sumEvenToX(5));
        System.out.println("sumEvenToX(8)==>"+sumEvenToX(8));

    }

     public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i =1; i <= x; i ++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}







