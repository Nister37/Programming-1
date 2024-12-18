import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final byte MAXIMUM = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Which number would you like to see the multiplies of? ");
        int number = in.nextInt();
        int toAdd = number;

        while (number<MAXIMUM){
            System.out.println(number);
            number += toAdd;
        }
    }
}