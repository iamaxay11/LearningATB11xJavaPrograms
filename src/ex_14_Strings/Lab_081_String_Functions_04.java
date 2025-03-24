package ex_14_Strings;
// split() , startsWith(), endsWith(), compareTo()
public class Lab_081_String_Functions_04 {
    public static void main(String[] args) {
        String str1 = "Apple,Banana,Mango";
        String str2 = "This is the test string separated by space";

        // split(String regex)
        String[] split = str1.split(",");
        System.out.println(split[0]); // Apple
        System.out.println(split[1]); // Banana
        System.out.println(split[2]); // Mango

        // startsWith()
        System.out.println(str2.startsWith("This")); // true
        System.out.println(str2.startsWith("Akshay")); // false
        System.out.println(str2.startsWith("This is the test string ")); // true

        //endsWith()
        System.out.println(str2.endsWith("space")); // true
        System.out.println(str1.endsWith("Banana")); // false

        // compareTo() -> compares two strings lexicographically
        String str3 = "Apple";
        String str4 = "Banana";
        String str5 = "Apple";

        System.out.println(str3.compareTo(str4)); // -1 -> (Apple (5) < Banana(6)) => 5-6 = -1
        System.out.println(str3.compareTo(str5)); // 0 -> (Apple = Apple)
        System.out.println(str4.compareTo(str5)); // 1 -> (Banana (6) > Apple (5)) => 6-5 = 1

        System.out.println(str1.compareTo(str3)); // 13 => ("Apple,Banana,Mango" > "Apple")


    }
}
