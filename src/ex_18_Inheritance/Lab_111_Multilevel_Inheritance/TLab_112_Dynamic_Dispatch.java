package ex_18_Inheritance.Lab_111_Multilevel_Inheritance;

public class TLab_112_Dynamic_Dispatch {
    public static void main(String[] args) {
        Vehicle myVehicle; // Parent class reference

        myVehicle = new Car(); // Upcasting - Assigning Car object to Vehicle reference
        myVehicle.run(); // Calls Car's run() method

        myVehicle = new Bike(); // Upcasting - Assigning Bike object to Vehicle reference
        myVehicle.run(); // Calls Bike's run() method
    }

}
// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

// Child class 1
class Car extends Vehicle {
    void run() {
        System.out.println("Car is running at 100 km/h");
    }
}

// Child class 2
class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running at 80 km/h");
    }
}


