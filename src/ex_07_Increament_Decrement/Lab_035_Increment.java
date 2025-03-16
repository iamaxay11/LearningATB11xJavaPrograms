package ex_07_Increament_Decrement;

public class Lab_035_Increment {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        // Pre-increment in an expression
        int result1 = 5 + (++x); // x becomes 11 first, then 5 + 11 = 16

        // Post-increment in an expression
        int result2 = 5 + (y++); // 5 + 10 = 15, then y becomes 11

        System.out.println("Result using Pre-increment: " + result1); // 16
        System.out.println("Updated x: " + x); // 11

        System.out.println("Result using Post-increment: " + result2); // 15
        System.out.println("Updated y: " + y); // 11
    }
}

