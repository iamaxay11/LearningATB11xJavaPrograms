package ex_10_ForLoop;

public class Lab_061_EvenNo_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even Number :" + i);

        }
    }
}
