package ex_012_Do_While;

import java.util.Scanner;

public class Lab_069_ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        do {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Append to reversed number
            num /= 10; // Remove last digit
        } while (num > 0);

        System.out.println("Reversed Number: " + reversed);
    }
}

