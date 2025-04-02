package ex_15_Arrays;

public class Lab_095_2D_Jagged_Array {
    public static void main(String[] args) {
        // Declaring a Jagged Array with 3 rows
        int jagged [][] = new int[3][];

        // Allocating different column sizes for each row
        jagged[0] = new int[2];  // First row has 2 columns
        jagged[1] = new int[4];  // Second row has 4 columns
        jagged[2] = new int[3];  // Third row has 3 columns

        // Initializing the jagged array with values
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5, 6};
        jagged[2] = new int[]{7, 8, 9};

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
