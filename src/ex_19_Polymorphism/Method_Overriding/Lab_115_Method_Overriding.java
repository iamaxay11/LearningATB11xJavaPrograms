package ex_19_Polymorphism.Method_Overriding;

public class Lab_115_Method_Overriding {
    public static void main(String[] args) {
        Animal myAnimal;  // Parent class reference

        myAnimal = new Dog();  // Upcasting
        myAnimal.makeSound();  // Calls Dog's overridden method

        myAnimal = new Cat();  // Upcasting
        myAnimal.makeSound();  // Calls Cat's overridden method
    }

}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal{
    // Overriding makeSound() method
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    // Overriding makeSound() method
    void makeSound(){
        System.out.println("Cat Meewww");
    }
}