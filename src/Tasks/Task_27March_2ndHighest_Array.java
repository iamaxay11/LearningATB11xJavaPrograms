package Tasks;

public class Task_27March_2ndHighest_Array {
    public static void main(String[] args) {
        int numbers[]={20,98,78,97,67,57,98};

        int max1 = 0;
        int max2 = 0;

        for(int i=0; i< numbers.length ; i++){

            if(numbers[i]>max1){
                max2 = max1;
                max1 = numbers[i];
            }
            else if (numbers[i]>max2 && numbers[i]!=max1) {
                max2=numbers[i];
            }

        }
        System.out.println("First largest number is: " +max1);
        System.out.println("Second largest number is: " +max2);
    }
}
