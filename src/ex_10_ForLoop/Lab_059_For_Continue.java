package ex_10_ForLoop;

public class Lab_059_For_Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i == 5) {
                continue; // continue will skip the execution for interation
            }
            System.out.println(i);
        }
    }
}
