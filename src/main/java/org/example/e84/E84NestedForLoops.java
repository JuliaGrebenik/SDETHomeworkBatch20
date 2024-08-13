package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        // Use nested loops to fill the 2D array with multiplication table values
        for (int i = 0; i < table.length; i++) {
            for (int c = 0; c < table[i].length; c++) {
                table[i][c] = (i + 6) * (c + 1);

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int c = 0; c < table[i].length; c++) {
            // Use nested loops to iterate through the 2D array and print the pattern
            System.out.print(table[i][c]+" ");
        }
        System.out.println();
    }
}
}

