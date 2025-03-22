package Practice;
// Demonstrate pre-decrement (--a) and post-decrement (a--).
public class P018_Decrement {
    public static void main(String[] args) {

        int a = 5 ;

        System.out.println(a); // 5
        System.out.println(a--); // 5
        System.out.println(--a); // 3
        System.out.println(a-- + --a); // 4
        System.out.println(a); // 1
    }
}
