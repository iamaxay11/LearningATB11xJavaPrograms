package ex_15_Arrays;

public class Lab_087_Array_Declaration {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Amit";
        names[1] = "Sumit";
        names[2] = "Asmit";
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
    }
}
