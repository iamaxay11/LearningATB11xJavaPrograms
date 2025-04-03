package ex_19_Polymorphism.Method_Overriding;

public class Lab_116_Method_Overriding {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        System.out.println("Manager's Salary: " + emp1.calculateSalary());
        System.out.println("Developer's Salary: " + emp2.calculateSalary());
    }
}
class Employee {
    double calculateSalary() {
        return 40000; // Base salary for employees
    }
}

class Manager extends Employee {
    // Overriding calculateSalary method
    double calculateSalary() {
        return 80000; // Higher salary for managers
    }
}

class Developer extends Employee {
    // Overriding calculateSalary method
    double calculateSalary() {
        return 60000; // Salary for developers
    }
}