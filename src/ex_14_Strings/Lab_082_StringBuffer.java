package ex_14_Strings;

public class Lab_082_StringBuffer {
    public static void main(String[] args) {
        // Creating a StringBuffer object (Mutable)
        StringBuffer stringBuffer = new StringBuffer("Kohli Goes down the ground,");

        // Using append() method → Modifies the original StringBuffer object
        stringBuffer.append(" Kohli Goes out of the ground");

        // Printing the modified stringBuffer
        System.out.println("After append: " + stringBuffer);
        // Output: Kohli Goes down the ground, Kohli Goes out of the ground

        // Using reverse() method → Modifies the same StringBuffer object
        System.out.println("After reverse: " + stringBuffer.reverse());
        // Output: The entire string is reversed
        // Checking if stringBuffer is modified, string is modified
        System.out.println(stringBuffer);
        // Output-: dnuorg eht fo tuo seoG ilhoK ,dnuorg eht nwod seoG ilhoK

        // Creating two String objects (Immutable)
        String s1 = "Hello";
        String s2 = " World!";

        // String concatenation using '+' → Creates a new String object
        String s3 = s1 + s2;  // New string "Hello World!" is created in memory

        // Printing the concatenated string
        System.out.println("Concatenated String: " + s3);
        // Output: Hello World!

        // Checking if s1 is modified (It remains unchanged because String is immutable)
        System.out.println("Original String s1: " + s1);
        // Output: Hello (s1 is not changed)

    }
}
