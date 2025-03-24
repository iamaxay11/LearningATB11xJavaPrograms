package ex_014_Strings;
// charAt() , indexOf(ch), concat() , trim()
public class Lab_079_String_Functions_02 {
    public static void main(String[] args) {
        String str1 = "itsakshay";
        String str2 = "    Akshay    ";
        String str3 = " Chavan";

        // charAt()
        System.out.println(str1.charAt(3)); // a -> char at 3rd index
        // i t s a k s h a y  <- Char
        // 0 1 2 3 4 5 6 7 8  <- Index

        // indexOf()
        System.out.println(str1.indexOf('k')); // 4
        System.out.println(str1.indexOf('a')); // 3 -> finds first index of char which is 3
        System.out.println(str1.indexOf('m')); // -1 -> no char 'm' is string

        // concat()
        System.out.println(str1.concat("10")); // itsakshay10
        System.out.println(str1.concat(str3)); // itsakshay Chavan

        // trim () -> removes spaces at start and end
        System.out.println(str2); // "    Akshay    "
        System.out.println(str2.trim()); // "Akshay"
    }
}
