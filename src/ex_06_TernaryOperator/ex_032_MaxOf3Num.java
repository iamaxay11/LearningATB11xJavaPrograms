package ex_06_TernaryOperator;

public class ex_032_MaxOf3Num {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        // Nested ternary operator to find the maximum number
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The maximum number is: " + max);
    }
}
