package ex_013_Functions;
// Function With Parameters and Return Type
public class Lab_073_WithPara_WithReturn {

        // Function with parameters and return value
        static int multiply(int a, int b) {
            return a * b;
        }

        public static void main(String[] args) {
            int result = multiply(25, 20); // Storing returned value
            System.out.println("Multiplication: " + result);
        }

}
