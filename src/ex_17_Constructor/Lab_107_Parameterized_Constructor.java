package ex_17_Constructor;

public class Lab_107_Parameterized_Constructor {
    public static void main(String[] args) {
        Carz car1 = new Carz();
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("Parameterized Constructor");
        Carz car2 = new Carz("Honda",2025,"i10");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}

class Carz{
    String name;
    int year;
    String model;

    Carz(){
        name = "Toyota";
        year = 2020;
        model = "Fortuner";
        System.out.println("Default Constructor");
    }

    Carz(String name_args,int year_args, String model_args){
        this.name = name_args;
        this.year = year_args;
        this.model = model_args;

    }

}