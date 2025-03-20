package ex_10_ForLoop;

public class Lab_057_EvenOdd {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println("Even Number :" +i);
            }
            else {
                System.out.println("Odd Number :" + i);
            }
        }
    }
}
