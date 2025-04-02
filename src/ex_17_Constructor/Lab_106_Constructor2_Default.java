package ex_17_Constructor;

public class Lab_106_Constructor2_Default {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.name);
        System.out.println(car1.year);

        Car car2 = new Car();
        car2.name= "Kia";
        System.out.println(car2.name);
        System.out.println(car2.year);

    }
}
class Car {
    String name;
    int year;

    Car(){
        name = "Unknown";
        year = 2000;
    }
}