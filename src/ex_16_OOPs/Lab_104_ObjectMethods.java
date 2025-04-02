package ex_16_OOPs;

public class Lab_104_ObjectMethods {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setDetails("Amit",79);

        std1.getDetails();
    }
}

class Student {
    String name;
    int marks;

    // Method to set data
    void setDetails(String studentName, int studentMarks) {
        name = studentName;
        marks = studentMarks;
    }

    // Method to display student details
    void getDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
