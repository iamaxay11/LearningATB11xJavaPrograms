package ex_18_Inheritance.Lab_111_Multilevel_Inheritance;

public class Test4_Dynamic_Dispatch {
    public static void main(String[] args) {
        // Dynamic Dispatch
        /*
        Upcasting (a1_Grandfather g2 = new a2_Father();)
        A Father object (a2_Father) is referenced by a Grandfather variable (g2).
        Can only call methods present in a1_Grandfather, but if a2_Father overrides any method,
        the overridden version will be called.
        */

        a1_Grandfather g2 = new a2_Father();
        g2.grandFather();
        g2.home();

//        GrandFather has 1 BHK.
//        Home made up of Stones -> when void home() not present in a2_Father
//        g2.home(); calls home() from a1_Grandfather, as a2_Father does not override it.

//        GrandFather has 1 BHK.
//        Home made up of Bricks and Cement. -> when when void home() present in a2_Father
//        g2.home(); calls home() from a2_Father because it overrides home() from a1_Grandfather.

    }
}
