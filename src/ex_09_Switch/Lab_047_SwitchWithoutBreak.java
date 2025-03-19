package ex_09_Switch;

public class Lab_047_SwitchWithoutBreak {
    public static void main(String[] args) {
        int starRating = 2;
        switch (starRating){
            case 1 : System.out.println("1 Star Rating");
            case 2 : System.out.println("2 Star Rating");
            case 3 : System.out.println("3 Star Rating");
            case 4 : System.out.println("4 Star Rating");
            case 5 : System.out.println("5 Star Rating");
        }
    }
}

// ❌ Problem: No break, so execution continues.