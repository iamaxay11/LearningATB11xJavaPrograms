package ex_012_Do_While;
import java.util.Scanner;
public class Lab_068_SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, i = 1;

        do {
            sum += i; // Add current value of i to sum
            i++;
        } while (i <= n);

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
