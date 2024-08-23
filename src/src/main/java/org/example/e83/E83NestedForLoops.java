package src.main.java.org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        for (int i = 0; i < table.length; i++) {
            for (int c = 0; c < table[i].length; c++) {
                table[i][c] = (i + 1) * (c + 1);
            }
        }
        for(int i=0; i<table.length; i++){
            for(int c=0; c<table[i].length; c++){
                System.out.print(table[i][c]+" ");
            }
            System.out.println();

        }
    }
}
