package Tasks;

import java.util.Scanner;

public class Task_20March_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1, count = 0;

        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        while (count < n - 2) { // Since first two terms are already printed
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count++;
        }
    }
}

