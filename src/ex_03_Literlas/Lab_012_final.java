package ex_03_Literlas;

public class Lab_012_final {
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // Final variable (constant)
        System.out.println("Final variable value: " + MAX_VALUE);

        // Uncommenting the below line will cause an error
        // MAX_VALUE = 200; // Error: Cannot assign a value to final variable
    }
}

