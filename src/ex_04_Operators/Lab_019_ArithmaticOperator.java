package ex_04_Operators;
/*
Operators in Java:
1. Arithmetic Operators (+, -, *, /, %) - Perform basic mathematical operations.
2. Relational Operators (==, !=, >, <, >=, <=) - Compare values and return boolean results.
3. Logical Operators (&&, ||, !) - Work with boolean values.
4. Bitwise Operators (&, |, ^, ~, <<, >>) - Perform operations at the binary level.
5. Assignment Operators (=, +=, -=, *=, /=, %=) - Assign and modify values.
6. Unary Operators (+, -, ++, --) - Increase/decrease values.
7. Ternary Operator (? :) - Short form of if-else condition.
8. instanceof Operator - Checks object type.
*/
public class Lab_019_ArithmaticOperator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));   // Adds two numbers
        System.out.println("Subtraction: " + (a - b)); // Subtracts second from first
        System.out.println("Multiplication: " + (a * b)); // Multiplies two numbers
        System.out.println("Division: " + (a / b));   // Divides first by second
        System.out.println("Modulus: " + (a % b));    // Remainder of division
    }

}
