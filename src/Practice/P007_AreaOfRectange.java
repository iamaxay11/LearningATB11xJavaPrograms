package Practice;

import java.util.Scanner;

// Write a program to calculate the area of a rectangle.
public class P007_AreaOfRectange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of Rectangle : ");
        int base = scanner.nextInt();
        System.out.println("Enter the height of Rectangle : ");
        int height = scanner.nextInt();

        System.out.println("Area of Rectangle is : " + (base * height));

    }
}
