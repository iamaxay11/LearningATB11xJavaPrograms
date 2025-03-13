package ex_05_TypeCasting;

public class Lab_028_ExplicitNarrowing {
    public static void main(String[] args) {

        int x=200;
        byte y= (byte)x;

        System.out.println(y); //-56

        // Explicit Casting (Narrowing) - Possible data loss
        double pi = 3.14159;
        int intPi = (int) pi; // double to int

        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + pi);
        System.out.println("Converted int value: " + intPi);
    }
}
