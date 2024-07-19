import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        String x = max(3, 6);

        System.out.println(x);
    }



    public static String max (int a, int b) {
        if (a > b) {
            return "Число а больше б";
        }
        if (a < b) {
            return "Число а меньше б";
        } else {
            return ("Числа равны");
        }


    }
}
