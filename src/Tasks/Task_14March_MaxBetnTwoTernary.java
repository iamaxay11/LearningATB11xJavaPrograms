package Tasks;

public class Task_14March_MaxBetnTwoTernary {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        System.out.println("number1 : " +number1 );
        System.out.println("number2 : " +number2 );

        int max = (number1 > number2) ? number1 : number2 ;
      // int max = Math.max(number1, number2);

        System.out.println("Max number is: " +max);


    }
}
