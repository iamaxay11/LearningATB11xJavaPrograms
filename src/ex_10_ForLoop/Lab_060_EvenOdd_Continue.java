package ex_10_ForLoop;

public class Lab_060_EvenOdd_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number :" + i);
                continue;
            }
            System.out.println("Odd :" + i);

        }
    }
}
// Odd :49
// Even Number :50

// continue will move the execution back otherwise it will print line 10 for all 50 iterations