package ex_01_javaBasics;

public class Lab_008_BasicMaths {

        public static void main(String[] args) {
            // Declaring variables
            int a = 10, b = 5;

            // Addition
            System.out.println("Addition: " + (a + b)); // Output: 15

            // Subtraction
            System.out.println("Subtraction: " + (a - b)); // Output: 5

            // Multiplication
            System.out.println("Multiplication: " + (a * b)); // Output: 50

            // Division
            System.out.println("Division: " + (a / b)); // Output: 2

            // Modulus (Remainder)
            System.out.println("Modulus: " + (a % b)); // Output: 0

            // Using Math class
            double x = 2.5, y = 3.7;

            // Power (x^y)
            System.out.println("Power: " + Math.pow(x, y)); // 2.5^3.7

            // Square root
            System.out.println("Square Root of a: " + Math.sqrt(a)); // √10

            // Maximum of two numbers
            System.out.println("Maximum: " + Math.max(a, b)); // Max of (10,5)

            // Minimum of two numbers
            System.out.println("Minimum: " + Math.min(a, b)); // Min of (10,5)

            // Absolute value
            System.out.println("Absolute: " + Math.abs(-15)); // Output: 15
        }
    }


