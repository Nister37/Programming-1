import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(1,45+1);
            System.out.println(number);
        }
    }
}