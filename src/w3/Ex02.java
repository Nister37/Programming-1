import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        char letter  = sc.nextLine().charAt(0);
        String points = "";
        switch (letter) {
            case 'A','E','I','O','U', 'L', 'N', 'S', 'T', 'R' -> points = "1 point";
            case 'D', 'G' -> points = "2 points";
            case 'B', 'C', 'M', 'P' -> points = "3 points";
            case 'F', 'H', 'V', 'W', 'Y' -> points = "4 points";
            case 'K' -> points = "5 points";
            case 'J', 'X' -> points = "8 points";
            case 'Q', 'Z' -> points = "10 points";
            default -> System.out.println("Invalid input");
        }
        System.out.print(points);
    }
}