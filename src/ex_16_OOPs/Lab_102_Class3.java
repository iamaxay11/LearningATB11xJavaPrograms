package ex_16_OOPs;

public class Lab_102_Class3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name= "ajinkya";
        p1.age = 27;

        p1.display();
    }
}

class Person{
    // Instance variables (attributes)
    String name;
    int age;

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}