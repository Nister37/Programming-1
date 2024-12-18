import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float decimal;
        boolean isOK = false;

        do {
            try {
                System.out.println("Enter the decimal number between 0 and 10: ");
                decimal = sc.nextFloat();
                if (decimal > 0 && decimal < 10) {
                    isOK = true;
                    System.out.println("The correct number had been inputted!");
                }else{
                    System.out.println("The number must be between 0 and 10!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }while(!isOK);
    }
}