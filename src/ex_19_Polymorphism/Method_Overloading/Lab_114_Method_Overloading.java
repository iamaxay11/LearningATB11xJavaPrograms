package ex_19_Polymorphism.Method_Overloading;

public class Lab_114_Method_Overloading {
    public static void main(String[] args) {
        MathOperation math1 = new MathOperation();

        System.out.println(math1.add(2,98,2)); // Calls second method
        System.out.println(math1.add(8.87,75.23)); // Calls Third method
        System.out.println(math1.add(34,54)); // Calls first method

    }
}

class MathOperation{

    // Method with 2 int parameters
    int add(int a, int b){
       return a+b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c){
        return a+b+c;
    }

    // Method with 2 double parameters (Date Type change)
    double add(double a, double b){
        return a+b;
    }
}