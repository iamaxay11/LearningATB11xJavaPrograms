package ex_15_Arrays;

public class Lab_086_Array_Declaration {
    public static void main(String[] args) {

        int a[] = new int[3];   // ✅ VALID: Size is specified // // {0, 0, 0}
       // Since it's an integer array, each element is automatically initialized to 0 (default value for int in Java).


        int b[] = {1, 2, 3};    // ✅ VALID: Direct initialization
        int c[] = new int[]{4, 5, 6}; // ✅ VALID: Using new keyword with initialization


        // int e[] = new int[-3]; // ** NegativeArraySizeException ** at runtime
        // int d[] = new int[];  // ❌ INVALID: Missing size or initialization values

        // System.out.println(a[-1]); //ArrayIndexOutOfBoundsException
        // System.out.println(a[10]); // ArrayIndexOutOfBoundsException

        System.out.println(a[1]); // 0 ->  {0, 0, 0}
        System.out.println(b[1]); // 2
        System.out.println(c[2]); // 6


    }
}
