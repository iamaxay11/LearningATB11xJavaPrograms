package ex_15_Arrays;

import java.util.Scanner;

public class Lab_097_RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number e.g n=3");
        int n = scanner.nextInt();

        for( int i = 0 ; i <= n; i++){
            for( int j = 0 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
