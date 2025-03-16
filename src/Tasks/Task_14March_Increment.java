package Tasks;

public class Task_14March_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++ );

        // ++a (11) + a++ (11) + a++ (12) = 11 + 11 + 12 = 34
    }
}
