package ex_14_Strings;

public class Lab_084_SB_Methods {
    public static void main(String[] args) {
        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() → Adds text at the end
        sb.append(" World");
        System.out.println("Append: " + sb);  // Hello World

        // 2. insert() → Inserts at index
        sb.insert(5, ",");
        System.out.println("Insert: " + sb);  // Hello, World

        // 3. replace() → Replaces from index 6 to 11
        sb.replace(6, 12, "Java");
        System.out.println("Replace: " + sb); // Hello,Java

        // 4. delete() → Deletes characters from index 0 to 2
        sb.delete(0, 2);
        System.out.println("Delete: " + sb);  // llo,Java

        // 5. deleteCharAt() → Deletes a single character
        sb.deleteCharAt(2);
        System.out.println("DeleteCharAt: " + sb); // lo,Java

        // 6. reverse() → Reverses the string
        sb.reverse();
        System.out.println("Reverse: " + sb);  // avaJ,ol

        // 7. length() → Returns length
        System.out.println("Length: " + sb.length());  // 7

        // 8. capacity() → Returns buffer capacity
        System.out.println("Capacity: " + sb.capacity()); // Default: 16 + length

        // 9. ensureCapacity() → Ensures min capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity: " + sb.capacity()); // 50 or more

        // 10. charAt() → Returns character at index
        System.out.println("CharAt(2): " + sb.charAt(2)); // v

        // 11. setCharAt() → Modifies character at index
        sb.setCharAt(2, 'X');
        System.out.println("SetCharAt(2): " + sb); // avXJ,ol

        // 12. substring() → Returns substring from index # It doesn't modify original string
        System.out.println("Substring(2): " + sb.substring(2)); // XJ,ol

        // 13. substring(start, end) → Returns substring in range
        System.out.println("Substring(2,5): " + sb.substring(2, 5)); // XJ,
        System.out.println(sb);

        sb.replace(0,8,"Hello, Java");
        // 14. indexOf() → Finds first occurrence of substring
        System.out.println("IndexOf(','): " + sb.indexOf(",")); // 5

        // 15. lastIndexOf() → Finds last occurrence
        System.out.println("LastIndexOf('l'): " + sb.lastIndexOf("l")); // 3

        // 16. setLength() → Changes string length (cuts or extends)
        sb.setLength(5);
        System.out.println("SetLength(5): " + sb); // Hello
    }
}


