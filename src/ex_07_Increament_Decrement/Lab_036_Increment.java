package ex_07_Increament_Decrement;

public class Lab_036_Increment {
    public static void main(String[] args) {
        int a = 3, b = 3;
        int result = (++a) + (b++);

        System.out.println("Result: " + result); // (4 + 3) = 7
        System.out.println("Updated a: " + a); // 4
        System.out.println("Updated b: " + b); // 4
    }
}

