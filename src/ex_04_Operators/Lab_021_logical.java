package ex_04_Operators;

public class Lab_021_logical {
    public static void main(String[] args) {
        boolean x = true, y = false;
        // OR -> false || false -> false, Rest others true
        // AND -> true && true -> true, Rest others false
        // Logical Operators
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
    }
}