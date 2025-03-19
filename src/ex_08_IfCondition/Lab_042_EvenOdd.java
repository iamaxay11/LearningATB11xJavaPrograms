package ex_08_IfCondition;
import java.util.Scanner;

public class Lab_042_EvenOdd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }
        }
    }
