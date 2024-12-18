import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();

        //part1
        int number;
        for (int i = 0; i < 6; i++) {
            number = rand.nextInt(1, 6+1);
            System.out.print(number + " ");
        }
        System.out.println();
        boolean bool;
        for (int i = 0; i < 4; i++) {
            bool = rand.nextBoolean();
            System.out.print(bool + " ");
        }
        System.out.println();
        double decimal;
        for (int i = 0; i < 3; i++) {
            decimal = rand.nextDouble(0,1);
            System.out.print(decimal + " ");
        }
        System.out.println();

        //part2
        for (int i = 0; i < 10; i++) {
            number = rand.nextInt(900, 1000+1);
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            decimal = rand.nextDouble(5,10+1);
            System.out.print(decimal + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            number = rand.nextInt(0,50+1)*2;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            number = rand.nextInt(0,33+1)*3;
            System.out.print(number + " ");
        }
    }
}