package ex_15_Arrays;

public class Lab_094_2D_ArrayDeclaration {
    public static void main(String[] args) {
        // Declaring and Initializing a 2D Array (3x3 matrix)
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Traversing and Printing the 2D Array using a nested loop
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {  // Loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Moves to the next row
        }
    }
}
