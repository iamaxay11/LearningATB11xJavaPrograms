package ex_011_While_Loop;

import java.util.Scanner;

public class Lab_063_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number whose Factorial need to check :");
        int number = scanner.nextInt();

        int factorial = 1;

        if(number <= 0){
            System.out.println(factorial);
        } else {

            for(int i = 1; i <= number ; i++){
                factorial = factorial * i;
            }
            System.out.println("Factorial Number is : " +factorial);
        }
    }
}
