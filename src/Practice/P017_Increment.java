package Practice;
// Demonstrate pre-increment (++a) and post-increment (a++).
public class P017_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12
        System.out.println(a++ + ++a); // 26
        System.out.println(a); // 14


    }
}
