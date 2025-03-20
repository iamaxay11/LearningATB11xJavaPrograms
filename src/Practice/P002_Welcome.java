package Practice;

// Write a Java program to print your name, age, and favorite programming language from Scanner clas.


import java.util.Scanner;

public class P002_Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter Your Favorite Language : ");
        String lang = scanner.nextLine();

        System.out.println("My Name is " + name + " Having age " +age +". My favorite programming language is " +lang);

        scanner.close();
    }

}
