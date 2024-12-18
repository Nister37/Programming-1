import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB;

        System.out.print("Enter 1st number: ");
        numA = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        numB = sc.nextInt();

        try {
            int result = (int) (numA / numB);
            System.out.println(numA + " / " + numB + " = " + result);
        }catch(ArithmeticException a){
            System.out.println("Can't divide by zero!");
        }
    }
}