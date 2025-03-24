package ex_014_Strings;
// substring(), replace() , contains()
public class Lab_080_String_Functions_03 {
    public static void main(String[] args) {
        String str1 = "itsakshaychavan";
        String str2 = "JavaScript Basics";
        String str3 = " Chavan";

        // substring(startIndex, EndIndex) -> EndIndex is exclusive
        System.out.println(str1.substring(3,9)); // akshay => at index 9 char is 'c' but its exclusive
        System.out.println(str1.substring(3)); // akshaychavan

        // replace (old, new)
        System.out.println(str2.replace('a','#')); // J#v#Script B#sics

        // contains()
        System.out.println(str1.contains("akshay")); // true
    }
}
