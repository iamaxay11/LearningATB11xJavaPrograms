package ex_18_Inheritance;

public class Lab_109_Inheritance {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.bhk();

       Grandfather s = new Father();
        s.bhk();

        Father f = new Son();
        f.bhk();


    }
}

class Grandfather {
    void bhk() { //  Behaviour |  Method | Function | Data members
        System.out.println("GrandFather - 1BHK");
    }
}
class Father extends Grandfather {
    void bhk(){
        System.out.println("Father - 2BHK ");
    }
}

class Son extends Father{
    void bhk(){
        System.out.println("Son - 3BHK ");
    }
}