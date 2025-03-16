package ex_07_Increament_Decrement;

public class Lab_037_Increment {
        public static void main(String[] args) {
            int p = 2;
            int q = ++p + p++ + ++p;

            System.out.println("Final q: " + q);
            System.out.println("Final p: " + p);
        }
    }


/*
++p → p = 3, so 3
p++ → p = 3 (used first), then p = 4
++p → p = 5, so 5
q = 3 + 3 + 5 = 11
 */