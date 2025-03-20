package ex_10_ForLoop;

public class Lab_058_For_Break {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }
    }
}
