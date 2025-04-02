package ex_16_OOPs;

public class Lab_103_Multiple_Objects {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.brand="TATA";
        car1.speed= 199;

        Cars car2 = new Cars();

        car1.showcar();
        car2.showcar();
    }


}

class Cars{

    String brand;
    int speed;

    void showcar(){
        System.out.println(brand + " is running at "+speed + " kmph");
    }
}