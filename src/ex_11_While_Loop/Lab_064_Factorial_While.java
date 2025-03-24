package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_064_Factorial_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number whose Factorial need to check :");
        int number = scanner.nextInt();

        int factorial = 1;

        if(number <= 0){
            System.out.println(factorial);
        } else {
            int i=1;

            while( i <= number){
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial Number is : " +factorial);
        }
    }
}
