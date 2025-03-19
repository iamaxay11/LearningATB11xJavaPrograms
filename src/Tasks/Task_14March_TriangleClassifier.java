package Tasks;
import java.util.Scanner;

public class Task_14March_TriangleClassifier {

    /*Triangle Classifier:
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal),
or scalene (no sides are equal).
Use an if-else statement to classify the triangle
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side1 of triangle : ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the side2 of triangle : ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the side3 of triangle : ");
        int side3 = scanner.nextInt();

        if((side1 == side2) && (side1 == side3)){
            System.out.println("Given Triangle is Equilateral");

        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Given Triangle is Isosceles");

        } else{
            System.out.println("Given Triangle is Scalene");
        }

    }
}
