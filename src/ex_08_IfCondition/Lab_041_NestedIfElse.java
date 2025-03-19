package ex_08_IfCondition;

public class Lab_041_NestedIfElse {
        public static void main(String[] args) {
            int age = 20;
            int weight = 45;

            if (age >= 18) {
                if (weight >= 50) {
                    System.out.println("Eligible to donate blood.");
                } else {
                    System.out.println("Not eligible due to low weight.");
                }
            } else {
                System.out.println("Not eligible due to age.");
            }
        }
    }


