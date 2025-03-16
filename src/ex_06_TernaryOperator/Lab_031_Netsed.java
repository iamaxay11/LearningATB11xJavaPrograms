package ex_06_TernaryOperator;

public class Lab_031_Netsed {
    public static void main(String[] args) {
        int num = -5;

        // Nested ternary operator to check positive, negative, or zero
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("The number is " + result);
    }
}
