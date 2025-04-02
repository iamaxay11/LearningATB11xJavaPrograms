package ex_16_OOPs;

public class Lab_100_Class {
    public static void main(String[] args) {

        // Creating an object of the Car class
        Car myCar1 = new Car();

        // Assigning values to the object's attributes
        myCar1.brand = "Maruti";
        myCar1.speed = 99;

        // Calling methods of the Car class using the object
        myCar1.park();
        myCar1.drive();
    }
}

// Defining a class named Car
class Car {
    // Attributes (Instance variables)
    String brand; // Stores car brand name
    int speed;    // Stores car speed

    // Method to simulate driving behavior
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    // Method to simulate parking behavior
    void park() {
        System.out.println(brand + " is parking at " + " Parking ");
    }
}
