package ex_13_Functions;
// Function With No Parameters But With Return Type
public class Lab_074_NoPara_WithReturnType {
    static float pi() {
        return 3.14f;
    }

    public static void main(String[] args) {
        float num = pi();
        System.out.println("Returned Number: " + num);
    }
}
