package ex_15_Arrays;

public class Lab_096_Jagged_Array2 {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int[][] jagged = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        // Traversing and Printing the Jagged Array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {  // Loop for rows
            for (int j = 0; j < jagged[i].length; j++) { // Loop for columns (different sizes)
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(); // Moves to the next row
        }
    }
}
