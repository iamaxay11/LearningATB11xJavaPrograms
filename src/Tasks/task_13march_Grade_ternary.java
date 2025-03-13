package Tasks;
import java.util.Scanner;

public class task_13march_Grade_ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int marks = scanner.nextInt();

        System.out.println("You entered integer: " + marks);

        String res =(marks<0 || marks>100)? "Enter Valid Number": (marks >= 90 && marks <=100) ? "A" : (marks >= 80) ? "B": (marks >=70) ? "C" :(marks >= 60) ? "D":"E";

        System.out.println(res);
    }
}
