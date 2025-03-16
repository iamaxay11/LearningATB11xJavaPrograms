package Tasks;
import java.util.Scanner;


public class Task_14March_MaxNoByScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer A : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter an integer B : ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2 ;
        // int max = Math.max(number1, number2);

        System.out.println("Max number is: " +max);


    }


}
