package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        // Use nested loops to iterate through the 2D array and count the elements that are both negative and odd
        int totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int r = 0; r < a[i].length; r++) {
                if (a[i][r] < 0 && a[i][r] % 2!=0) {
                    totalCount++;

                    // Print the total count of elements that are both negative and odd

                }
            }
        }
        System.out.println(totalCount);

    }
}

