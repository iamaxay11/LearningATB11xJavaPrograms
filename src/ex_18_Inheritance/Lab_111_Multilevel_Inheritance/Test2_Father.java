package ex_18_Inheritance.Lab_111_Multilevel_Inheritance;

public class Test2_Father {
    public static void main(String[] args) {
        a2_Father f1 = new a2_Father();
        f1.grandFather();
        System.out.println("-----------------------------------");
        f1.father();
        f1.home();
    }
}
