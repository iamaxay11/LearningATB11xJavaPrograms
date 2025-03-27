package ex_15_Arrays;

import java.util.Scanner;

public class Lab_089_Max_Min_UserInput_INCOMOPLETE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int size = sc.nextInt();

        String[] numbers =  new String[size];

        for(int i=0; i<numbers.length; i++){
            System.out.println("Enter the numbers");
            numbers[i]= sc.next();
        }

        sc.close();

        System.out.println("You have entered numbers : ");
        for( int i=0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // Need to covert array to int array

         /* int max = 0;
        for( int i = 0 ; i < numbers.length; i++){
            if (numbers[i] > max){

            }
        } */

    }
}
