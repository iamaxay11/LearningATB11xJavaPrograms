package ex_18_Inheritance.Lab_110_Single_Inheritance;

public class TestExecution {
    public static void main(String[] args) {
        TestCase_1 tc1 = new TestCase_1();
        tc1.runningTC1();

        TestCase_2 tc2 = new TestCase_2();
        tc2.runningTC2();
        tc2.readExcelFile();
    }
}
