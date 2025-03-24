package ex_14_Strings;

public class Lab_077_String_Memory_Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // String Constant Pool -> SCP -> 1 (Only one "Hello" string is created here for s1 and s4

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello"); // Object Area -> OA -> three different strings created in OA s2, s3 and s5

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3); // Output: false
        // Explanation: s1 refers to the "Hello" string in the String Constant Pool (SCP).
        // s3 refers to a new String object created in the heap memory using the 'new' keyword.
        // '==' compares object references (memory locations), and since they are in different memory areas, the result is false.

        System.out.println(s1 == s2); // Output: false
        // Explanation: Similar to the previous case, s1 is in the SCP, and s2 is a new String object in the heap.
        // They are different objects in memory, so '==' returns false.

        System.out.println(s2 == s3); // Output: false
        // Explanation: Both s2 and s3 are new String objects created in the heap using 'new'.
        // Each 'new String("Hello")' creates a distinct object in memory, even if they have the same content.
        // Therefore, their references are different, and '==' returns false.

        System.out.println(s1 == s4); // Output: true
        // Explanation: Both s1 and s4 are String literals with the same value "Hello".
        // Java optimizes this by using the String Constant Pool (SCP). When s4 is created,
        // the JVM checks if a string with the value "Hello" already exists in the SCP.
        // Since s1 already created it, s4 will point to the same existing string object in the SCP.
        // Thus, their references are the same, and '==' returns true.

        System.out.println(s3 == s5); // Output: false
        // Explanation: s3 refers to a String object with the value "Hello" in the heap.
        // s5 refers to a different String object with the value "hello" (lowercase 'h') in the heap.
        // The content is different (case-sensitive), and they are also different objects in memory.
        // Therefore, their references are different, and '==' returns false.
    }
}
