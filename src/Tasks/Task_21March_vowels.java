package Tasks;

import java.util.Scanner;

public class Task_21March_vowels {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Read input string
        scanner.close(); // Close scanner

        int vowels = 0, consonants = 0;
        str = str.toLowerCase(); // Convert to lowercase to handle case sensitivity

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get character at index i

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Increment vowel count
                    System.out.println(ch);
                } else {
                    consonants++; // Increment consonant count
                }
            }
        }

        // Print the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
