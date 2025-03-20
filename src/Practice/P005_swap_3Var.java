package Practice;

// Swap two numbers using a third variable.

public class P005_swap_3Var {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = b;
        b = a;
        a = c;

        System.out.println("a : " +a  +" b : " +b);
    }
}
