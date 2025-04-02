package ex_17_Constructor;

public class Lab_105_Constuctor {
    public static void main(String[] args) {
        Baby b1 = new Baby();

        b1.Cry();
    }
}

class Baby{
    String name;

    // Behavior / Methods
    void Cry(){
        System.out.println("Cry");
    }

    void Sleep(){
        System.out.println("Sleep");
    }

    void Eat(){
        System.out.println("Eat");
    }

    Baby(){
        System.out.println("This is Default Constructor");
    }


}