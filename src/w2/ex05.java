import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        final long MINIMUM_DIVIDEND = 1_000_000_000_000L;
        final long MINIMUM_DIVISOR = 10_000_000L;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 13-digit whole number: ");
        double num1 = input.nextDouble();

        toCheck(num1, MINIMUM_DIVIDEND);

        System.out.print("Enter an 8-digit whole number: ");
        double num2 = input.nextDouble();

        toCheck(num2, MINIMUM_DIVISOR);

        double quotient = num1 / num2;

        System.out.println("The quotient is " + quotient);
        System.out.print("Without the fractional part it's " + (int)Math.floor(quotient));

    }

    public static void toCheck(double valToCheck, long condition){
        if(valToCheck < condition){
            System.out.println("This number is too small.");
            System.exit(0);
        }
    }
}
