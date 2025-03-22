package Practice;

import java.util.Scanner;

// Find the largest of two numbers.
public class P022_If_LargestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        if(number1 > number2){
            System.out.println("The largest number is : " +number1);
        } else {
            System.out.println("Largest numnber is : " + number2);
        }
    }
}
