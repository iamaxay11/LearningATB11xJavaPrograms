package ex_14_Strings;

public class Lab_083_StringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object (Mutable)
        StringBuilder stringBuilder = new StringBuilder("Dhoni Finishes off in style, ");

        // Using append() method → Modifies the original StringBuilder object
        stringBuilder.append("India lifts the World Cup!");

        // Printing the modified stringBuilder
        System.out.println("After append: " + stringBuilder);
        // Output: Dhoni Finishes off in style, India lifts the World Cup!

        // Using reverse() method → Modifies the same StringBuilder object
        System.out.println("After reverse: " + stringBuilder.reverse());
        // Output: The entire string is reversed

        // Creating two String objects (Immutable)
        String s1 = "Captain ";
        String s2 = "Cool!";

        // String concatenation using '+' → Creates a new String object
        String s3 = s1 + s2;  // New string "Captain Cool!" is created in memory

        // Printing the concatenated string
        System.out.println("Concatenated String: " + s3);
        // Output: Captain Cool!

        // Checking if s1 is modified (It remains unchanged because String is immutable)
        System.out.println("Original String s1: " + s1);
        // Output: Captain (s1 is not changed)
    }
}
