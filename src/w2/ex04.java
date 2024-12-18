import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        final int MINIMUM = 100_000;
        final int MAXIMUM = 999_999;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 6-digit whole number: ");
        long num1 = input.nextLong();

        System.out.print("Enter another 6-digit whole number: ");
        long num2 = input.nextLong();

        if((num1 > MINIMUM && num1 < MAXIMUM) && (num2 > MINIMUM && num2 < MAXIMUM)){
            long product = num1 * num2;
            System.out.println("The product is " + product);
            System.out.println("The 5 final digits are: " + product%100_000);
        }else{
            System.out.println("One of the numbers is too small");
        }
    }
}
