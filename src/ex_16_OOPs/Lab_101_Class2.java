package ex_16_OOPs;

public class Lab_101_Class2 {
    public static void main(String[] args) {

        Cat Myau = new Cat();

        Myau.name = "MyauMyau";

        Myau.behavior();
        new Cat().behavior();

        System.out.println(new Cat().name);


    }
}

class Cat{
    String name;

    void behavior(){
        System.out.println("Cat is sweet");
    }
}