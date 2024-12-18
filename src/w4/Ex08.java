import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        StringBuilder firstName = new StringBuilder(sc.nextLine());

        int backwards = firstName.length() - 1;
        for (int i = 0; i < firstName.length(); i++) {
            if (firstName.charAt(i) == firstName.charAt(backwards)) {
                backwards--;
            }else{
                System.out.print("\"" + firstName + "\" is not a palindrome.");
                return;
            }
        }
        System.out.print("\"" + firstName + "\" is a palindrome.");
    }
}