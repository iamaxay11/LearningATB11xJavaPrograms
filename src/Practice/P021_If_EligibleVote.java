package Practice;

import java.util.Scanner;

// Check if a person is eligible to vote (age >= 18).
public class P021_If_EligibleVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are Eligible for Vote");
        } else{
            System.out.println("You are not Eligible for Vote");
        }
    }
}
