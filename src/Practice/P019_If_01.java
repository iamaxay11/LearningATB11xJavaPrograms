package Practice;
import java.util.Scanner;

// Check if a number is positive, negative, or zero.

public class P019_If_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("You have entered a Positive number");
        } else if(num < 0){
            System.out.println("You have entered a Negative number");
        } else {
            System.out.println("You have entered a Zero number");
        }

    }
}
