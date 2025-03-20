package Practice;

// Write a program that takes two integers as input and prints their sum, difference, and product.

import java.util.Scanner;

public class P004_SumDIffProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();

        System.out.println("Sum of Given two number is : " + (a+b));
        System.out.println("Difference of Given two number is : " + (a-b));
        System.out.println("Multiplication of Given two number is : " + (a*b));

    }
}
