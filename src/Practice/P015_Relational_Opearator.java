package Practice;

// Perform all relational operations (>, <, >=, <=, ==, !=).

import org.w3c.dom.ls.LSOutput;

public class P015_Relational_Opearator {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = 12;
        int d = -5;

        System.out.println(a > b); // false
        System.out.println(a > d); // true
        System.out.println(a < b); // true
        System.out.println(a >= c); // true
        System.out.println(a <= b); // true
        System.out.println(a == c); // true
        System.out.println(a == d); // false
        System.out.println(a != b); // true
        System.out.println(a != c); //false
    }
}
