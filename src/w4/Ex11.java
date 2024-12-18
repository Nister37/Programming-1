import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f ", rand.nextDouble());
        }
        System.out.println();

        Random rand1 = new Random(60);
        Random rand2 = new Random(60);

        for (int i = 0; i < 10; i++) {
            int val1 = rand1.nextInt(1,42+1);
            int val2 = rand2.nextInt(1,42+1);
            System.out.printf("%d %d ", val1, val2);
        }
    }
}