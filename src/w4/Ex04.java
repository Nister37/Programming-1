import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String firstText = sc.nextLine().trim();
        System.out.print("Enter another text: ");
        String secondText = sc.nextLine().trim();

        if ((int) firstText.toLowerCase().charAt(0) > (int) secondText.toLowerCase().charAt(0)) {
            System.out.println(secondText + " " + firstText);
        }else{
            System.out.println(firstText + " " + secondText);
        }
    }
}