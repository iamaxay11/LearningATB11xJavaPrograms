package ex_18_Inheritance.Lab_110_Single_Inheritance;

public class TestCase_2 extends Common_To_All{

    void runningTC2(){
        startBrowser();
        System.out.println("Running TestCase2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
