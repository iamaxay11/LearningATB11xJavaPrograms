package ex_03_Literlas;

public class Lab_017_ascii {
    public static void main(String[] args) {
        // Character literals
        char letterA = 'A';  // Direct character literal
        char numberChar = '7'; // Character representation of a number
        char symbol = '@';    // Special character

        // ASCII representation using integer literals
        char asciiA = 65;   // ASCII value of 'A'
        char asciiDollar = 36; // ASCII value of '$'
        char asciiSpace = 32;  // ASCII value of space

        System.out.println("Character Literal A: " + letterA);
        System.out.println("Character Literal 7: " + numberChar);
        System.out.println("Character Literal @: " + symbol);
        System.out.println("ASCII 65 -> Character: " + asciiA);
        System.out.println("ASCII 36 -> Character: " + asciiDollar);
        System.out.println("ASCII 32 -> Character (space): [" + asciiSpace + "]");
    }
}

