package ex_15_Arrays;

public class Lab_092_SumOfArray_EnhancedForLoop {
    public static void main(String[] args) {
        int[] marks = {76,98,67,87,60,90,99};

        int sum = 0;
        for (int n : marks) {
            sum = sum + n;
        }
        System.out.println("Sum of given Arrays: " +sum);
    }
}
