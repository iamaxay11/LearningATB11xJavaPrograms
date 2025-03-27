package ex_15_Arrays;

public class Lab_091_SumOfArray {
    public static void main(String[] args) {
        int [] marks = {65,98,56,46,89,78,66};

        int sum =0;
        for(int i = 0; i < marks.length ; i++){
            sum = sum + marks[i];
        }
        System.out.println("Sum of Given Array is : " +sum);

//        System.out.println(" For Each ---"); //Enhanced for loop
//        for (int n : marks) {
//            sum = sum + n;
//        }
//        System.out.println(sum);
    }
}
