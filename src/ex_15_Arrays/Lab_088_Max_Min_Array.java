package ex_15_Arrays;

public class Lab_088_Max_Min_Array {
    public static void main(String[] args) {
        int[] numbers = {32,49,98,46,24,04,36,87,23,35,32};

        int max_output = give_me_max(numbers);
        int min_output = give_me_min(numbers);
        System.out.println(max_output);
        System.out.println(min_output);


    }

    static int give_me_max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;

    }

    static int give_me_min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }
}
