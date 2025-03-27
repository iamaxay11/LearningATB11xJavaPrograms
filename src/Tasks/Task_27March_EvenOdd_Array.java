package Tasks;

public class Task_27March_EvenOdd_Array {
    public static void main(String[] args) {
        int numbers[]={20,98,78,97,67,57,98};

        for(int i=0; i< numbers.length; i++){

            if(numbers[i]%2 ==0){
                System.out.println("Even :" +numbers[i]);
            }else {
                System.out.println("Odd: " +numbers[i]);
            }
        }
    }
}
