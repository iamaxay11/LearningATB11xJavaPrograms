package Practice;

//Perform all logical operations (&&, ||, !).

public class P014_Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a && b); // true
        System.out.println(a && c); // false
        System.out.println(c && d); // false
        System.out.println(c && b); // false

        System.out.println(a || b); // true
        System.out.println(a || c); // true
        System.out.println(c || d); // false
        System.out.println(c || b); // true

        System.out.println(a != b); // false
        System.out.println(a != c); // true
    }
}
