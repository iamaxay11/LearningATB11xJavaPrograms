package ex_14_Strings;

public class Lab_076_String_Comparison {
    public static void main(String[] args) {

        // Using String literal (Stored in String Pool)
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello Java";
        String str7 = "Hello java";

        // Using new keyword (Stored in Heap Memory)
        String str4 = new String("Hello JS");
        String str5 = new String("Hello JS");
        String str6 = new String("Hello Java");

        // equals()
        System.out.println(str1.equals(str2)); // true ("Hello World" = "Hello World")
        System.out.println(str1.equals(str3)); // false ("Hello World" != "Hello Java")
        System.out.println(str1.equals(str4)); // false ("Hello World" != "Hello JS" )
        System.out.println(str3.equals(str6)); // true ("Hello Java" = "Hello Java")

        // equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2)); // true ("Hello World" = "Hello World")
        System.out.println(str1.equalsIgnoreCase(str3)); // false ("Hello World" != "Hello Java")
        System.out.println(str1.equalsIgnoreCase(str4)); // false ("Hello World" != "Hello JS" )
        System.out.println(str3.equalsIgnoreCase(str6)); // true ("Hello Java" = "Hello Java")
        System.out.println(str7.equalsIgnoreCase(str6)); // true
        System.out.println(str7.equalsIgnoreCase(str3)); // true

    }
}
