package ex_014_Strings;

public class Lab_075_String_Declaration {
    public static void main(String[] args) {
        // Using String literal (Stored in String Pool/ String Constant Pool SCP)
        String str1 = "Hello World";

        // Using new keyword (Stored in Heap Memory/ Object Area)
        String str2 = new String("Hello Java");

        System.out.println(str1);
        System.out.println(str2);
    }
}
